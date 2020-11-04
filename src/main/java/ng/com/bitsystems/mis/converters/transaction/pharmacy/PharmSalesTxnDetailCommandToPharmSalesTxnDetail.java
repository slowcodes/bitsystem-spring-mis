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
    private AdditionalTxnDetailCommandToAdditionTnxDetail additionalTxnDetailCommandToAdditionTnxDetail;
    private SalesPriceCodeCommandToSalesPriceCode salesPriceCodeCommandToSalesPriceCode;

    public PharmSalesTxnDetailCommandToPharmSalesTxnDetail(AdditionalTxnDetailCommandToAdditionTnxDetail additionalTxnDetailCommandToAdditionTnxDetail, SalesPriceCodeCommandToSalesPriceCode salesPriceCodeCommandToSalesPriceCode) {
        this.additionalTxnDetailCommandToAdditionTnxDetail = additionalTxnDetailCommandToAdditionTnxDetail;
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

        if(source.getAdditionalTransactionDetailCommands().size()>0 && source.getAdditionalTransactionDetailCommands()!=null)
            source.getAdditionalTransactionDetailCommands().forEach(additionalTransactionDetailCommand ->
                    details.getAdditionalTransactionDetails().add(
                            additionalTxnDetailCommandToAdditionTnxDetail.convert(
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
