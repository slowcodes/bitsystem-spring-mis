package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacyTransactionDetailCommand;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.transactions.Transaction;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class PharmTxnDetailCommandToPharmTxnDetail implements
        Converter<PharmacyTransactionDetailCommand, PharmacyTransactionDetails> {
    private AdditionalTxnDetailCommandToAdditionTnxDetail additionalTxnDetailCommandToAdditionTnxDetail;

    public PharmTxnDetailCommandToPharmTxnDetail(AdditionalTxnDetailCommandToAdditionTnxDetail additionalTxnDetailCommandToAdditionTnxDetail) {
        this.additionalTxnDetailCommandToAdditionTnxDetail = additionalTxnDetailCommandToAdditionTnxDetail;
    }

    @Nullable
    @Override
    public PharmacyTransactionDetails convert(PharmacyTransactionDetailCommand source) {
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

        if(source.getTransactionId()!=null){
            Transaction transaction=new Transaction();
            transaction.setId(source.getId());
            details.setTransaction(transaction);
        }

//        details.setComment(source.getComment());
//        details.setReversal(source.getReversal());
//        details.setSalesPriceCode(salesPriceCodeCommandToSalesPriceCode.convert(source.getSalesPriceCodeCommand()));
        //details.setTimeOfTransaction(source.getTimeOfTransaction());
        //details.setTransactionDate(source.getTimeOfTransaction());
//        details.setUseDiscountPrice(source.getUseDiscountPrice());
//        details.setUserDiscount(source.getUserDiscount());


        return details;
    }
}
