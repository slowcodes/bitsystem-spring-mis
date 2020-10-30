package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.PharmacyInvoiceDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.SalesPriceCodeCommandToSalesPriceCode;
import ng.com.bitsystems.mis.converters.pharmacy.PharmacyProductCommandToPharmacyProduct;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.AdditionalTxnDetailCommandToAdditionTnxDetail;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import ng.com.bitsystems.mis.models.invoice.PharmacyInvoiceDetailsSale;
import org.springframework.core.convert.converter.Converter;

public class PharmacyInvoiceDetailCommandToPharmacyInvoiceDetail
implements Converter<PharmacyInvoiceDetailCommand, PharmacyInvoiceDetailsSale> {
    private SalesPriceCodeCommandToSalesPriceCode salesPriceCodeCommandToSalesPriceCode;
    private AdditionalTxnDetailCommandToAdditionTnxDetail additionalTxnDetailCommandToAdditionTnxDetail;
    private PharmacyProductCommandToPharmacyProduct pharmacyProductCommandToPharmacyProduct;

    public PharmacyInvoiceDetailCommandToPharmacyInvoiceDetail(SalesPriceCodeCommandToSalesPriceCode salesPriceCodeCommandToSalesPriceCode,
                                                               AdditionalTxnDetailCommandToAdditionTnxDetail additionalTxnDetailCommandToAdditionTnxDetail,
                                                               PharmacyProductCommandToPharmacyProduct pharmacyProductCommandToPharmacyProduct) {
        this.salesPriceCodeCommandToSalesPriceCode = salesPriceCodeCommandToSalesPriceCode;
        this.additionalTxnDetailCommandToAdditionTnxDetail = additionalTxnDetailCommandToAdditionTnxDetail;
        this.pharmacyProductCommandToPharmacyProduct = pharmacyProductCommandToPharmacyProduct;
    }

    @Override
    public PharmacyInvoiceDetailsSale convert(PharmacyInvoiceDetailCommand source) {
        if(source==null){
            return null;
        }

        final PharmacyInvoiceDetailsSale sale = new PharmacyInvoiceDetailsSale();
        sale.setId(source.getId());

        if(source.getInvoiceId()!=null){
            Invoice invoice=new Invoice();
            invoice.setId(source.getInvoiceId());
            sale.setInvoice(invoice);
            invoice.addPharmacyInvoiceDetail(sale);
        }

        sale.setStatus(source.getStatus());
        sale.setSalesPriceCode(salesPriceCodeCommandToSalesPriceCode.convert(source.getSalesPriceCodeCommand()));

        if(source.getAdditionalTransactionDetailCommands().size()>0 && source.getAdditionalTransactionDetailCommands()!= null)
            source.getAdditionalTransactionDetailCommands().forEach(additionalTransactionDetailCommand ->
                    sale.getAdditionalTransactionDetails().add(additionalTxnDetailCommandToAdditionTnxDetail.convert(additionalTransactionDetailCommand)));

        sale.setSalesPriceCode(salesPriceCodeCommandToSalesPriceCode.convert(source.getSalesPriceCodeCommand()));
        sale.setComment(source.getComment());
        sale.setStatus(source.getStatus());
        sale.setPharmacyProducts(pharmacyProductCommandToPharmacyProduct.convert(source.getPharmacyProductCommand()));
        sale.setTimeOfTransaction(source.getTimeOfTransaction());
        sale.setUseDiscountPrice(source.getUseDiscountPrice());
        sale.setUserDiscount(source.getDiscount());

        return sale;
    }
}
