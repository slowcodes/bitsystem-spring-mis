package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySalesTransactionDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.SalesPriceCodeCommandToSalesPriceCode;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySalesTransaction;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class PharmSalesTxnDetailCommandToPharmSalesTxnDetail implements
        Converter<PharmacySalesTransactionDetailCommand, PharmacyTransactionDetails> {
    private AdditionalSaleTxnDetailCommandToAdditionTnxDetail additionalSaleTxnDetailCommandToAdditionTnxDetail;
    private SalesPriceCodeCommandToSalesPriceCode salesPriceCodeCommandToSalesPriceCode;

    public PharmSalesTxnDetailCommandToPharmSalesTxnDetail(AdditionalSaleTxnDetailCommandToAdditionTnxDetail additionalSaleTxnDetailCommandToAdditionTnxDetail, SalesPriceCodeCommandToSalesPriceCode salesPriceCodeCommandToSalesPriceCode) {
        this.additionalSaleTxnDetailCommandToAdditionTnxDetail = additionalSaleTxnDetailCommandToAdditionTnxDetail;
        this.salesPriceCodeCommandToSalesPriceCode = salesPriceCodeCommandToSalesPriceCode;
    }

    @Nullable
    @Override
    public PharmacyTransactionDetails convert(PharmacySalesTransactionDetailCommand source) {
        if(source==null)
            return null;

        final PharmacyTransactionDetails details = new PharmacyTransactionDetails();
        details.setId(source.getId());

        if(source.getPharmacyProductId()!=null){
            PharmacyProducts pharmacyProducts=new PharmacyProducts();
            pharmacyProducts.setId(source.getPharmacyProductId());
            details.setPharmacyProducts(pharmacyProducts);
            PharmacyProducts products = pharmacyProducts.addTransactionDetails(details);
        }

        if(source.getAdditionalSalesTransactionDetailCommands().size()>0 && source.getAdditionalSalesTransactionDetailCommands()!=null)
            source.getAdditionalSalesTransactionDetailCommands().forEach(additionalTransactionDetailCommand ->
                    details.getAdditionalSaleTransactionDetails().add(
                            additionalSaleTxnDetailCommandToAdditionTnxDetail.convert(
                                    additionalTransactionDetailCommand
                            )
                    ));

        if(source.getPharmacySalesTransactionId()!=null){
            PharmacySalesTransaction transaction=new PharmacySalesTransaction();
            transaction.setId(source.getId());
            details.setPharmacySalesTransaction(transaction);
            PharmacySalesTransaction salesTransaction=transaction.addTransaction(details);
        }

        details.setComment(source.getComment());
        details.setReversal(source.getReversal());
        details.setSalesPriceCode(salesPriceCodeCommandToSalesPriceCode.convert(source.getSalesPriceCodeCommand()));
        //details.setTimeOfTransaction(source.getTimeOfTransaction());
        //details.setTransactionDate(source.getTimeOfTransaction());
        details.setUseDiscountPrice(source.getUseDiscountPrice());
        details.setUserDiscount(source.getUserDiscount());


        return details;
    }
}
