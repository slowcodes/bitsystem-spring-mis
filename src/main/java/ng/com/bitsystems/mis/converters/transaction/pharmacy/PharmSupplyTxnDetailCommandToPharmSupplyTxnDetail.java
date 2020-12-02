package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySupplyTransactionDetailCommand;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactions;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactionsDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class PharmSupplyTxnDetailCommandToPharmSupplyTxnDetail implements
        Converter<PharmacySupplyTransactionDetailCommand, PharmacySupplyTransactionsDetails> {
    private AdditionalSupplyTxnDetailCommandToAdditionTnxDetail additionalSupplyTxnDetailCommandToAdditionTnxDetail;

    public PharmSupplyTxnDetailCommandToPharmSupplyTxnDetail(AdditionalSupplyTxnDetailCommandToAdditionTnxDetail additionalSupplyTxnDetailCommandToAdditionTnxDetail) {
        this.additionalSupplyTxnDetailCommandToAdditionTnxDetail = additionalSupplyTxnDetailCommandToAdditionTnxDetail;
    }

    @Nullable
    @Override
    public PharmacySupplyTransactionsDetails convert(PharmacySupplyTransactionDetailCommand source) {
        if(source==null)
            return null;

        final PharmacySupplyTransactionsDetails details = new PharmacySupplyTransactionsDetails();
        details.setId(source.getId());

        if(source.getPharmacyProductId()!=null){
            PharmacyProducts pharmacyProducts=new PharmacyProducts();
            pharmacyProducts.setId(source.getPharmacyProductId());
            details.setPharmacyProducts(pharmacyProducts);
            PharmacyProducts products = pharmacyProducts.addSupplyTransactionDetails(details);
        }

        if(source.getAdditionalSupplyTransactionDetailCommands().size()>0 && source.getAdditionalSupplyTransactionDetailCommands()!=null)
            source.getAdditionalSupplyTransactionDetailCommands().forEach(additionalTransactionDetailCommand ->
                    details.getAdditionalSupplyTransactionDetails().add(
                            additionalSupplyTxnDetailCommandToAdditionTnxDetail.convert(
                                    additionalTransactionDetailCommand
                            )
                    ));

        if(source.getPharmacySupplyTransactionId()!=null){
            PharmacySupplyTransactions transaction=new PharmacySupplyTransactions();
            transaction.setId(source.getId());
            details.setPharmacySupplyTransactions(transaction);
            PharmacySupplyTransactions salesTransaction=transaction.addSupplyTransaction(details);
        }

        details.setComment(source.getComment());
        details.setReversal(source.getReversal());
        details.setReversal(source.getReversal());
        details.setBatchNumber(source.getBatchNumber());
        details.setQty(source.getQty());
        details.setExpiryDate(source.getExpiryDate());

        //details.setTimeOfTransaction(source.getTimeOfTransaction());
        //details.setTransactionDate(source.getTimeOfTransaction());

        details.setUseDiscountPrice(source.getUseDiscountPrice());
        details.setUserDiscount(source.getUserDiscount());


        return details;
    }
}
