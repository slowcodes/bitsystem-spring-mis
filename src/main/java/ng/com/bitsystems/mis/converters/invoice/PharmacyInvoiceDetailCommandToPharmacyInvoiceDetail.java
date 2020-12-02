package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.PharmacyInvoiceDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.SalesPriceCodeCommandToSalesPriceCode;
import ng.com.bitsystems.mis.converters.pharmacy.PharmacyProductCommandToPharmacyProduct;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.AdditionalSaleTxnDetailCommandToAdditionTnxDetail;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import ng.com.bitsystems.mis.models.invoice.PharmacyInvoiceDetailsSale;
import org.springframework.core.convert.converter.Converter;

public class PharmacyInvoiceDetailCommandToPharmacyInvoiceDetail
implements Converter<PharmacyInvoiceDetailCommand, PharmacyInvoiceDetailsSale> {
    private SalesPriceCodeCommandToSalesPriceCode salesPriceCodeCommandToSalesPriceCode;
    private AdditionalSaleTxnDetailCommandToAdditionTnxDetail additionalSaleTxnDetailCommandToAdditionTnxDetail;
    private PharmacyProductCommandToPharmacyProduct pharmacyProductCommandToPharmacyProduct;

    public PharmacyInvoiceDetailCommandToPharmacyInvoiceDetail(SalesPriceCodeCommandToSalesPriceCode salesPriceCodeCommandToSalesPriceCode,
                                                               AdditionalSaleTxnDetailCommandToAdditionTnxDetail additionalSaleTxnDetailCommandToAdditionTnxDetail,
                                                               PharmacyProductCommandToPharmacyProduct pharmacyProductCommandToPharmacyProduct) {
        this.salesPriceCodeCommandToSalesPriceCode = salesPriceCodeCommandToSalesPriceCode;
        this.additionalSaleTxnDetailCommandToAdditionTnxDetail = additionalSaleTxnDetailCommandToAdditionTnxDetail;
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

        if(source.getAdditionalSalesTransactionDetailCommands().size()>0 && source.getAdditionalSalesTransactionDetailCommands()!= null)
            source.getAdditionalSalesTransactionDetailCommands().forEach(additionalTransactionDetailCommand ->
                    sale.getAdditionalSaleTransactionDetails().add(
                            additionalSaleTxnDetailCommandToAdditionTnxDetail.convert(additionalTransactionDetailCommand)
                    ));

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
