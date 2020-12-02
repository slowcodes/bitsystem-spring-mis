package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySupplyTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactionsDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class PharmSupplyTxnDetailToPharmSupplyTxnDetailCommand implements
        Converter<PharmacySupplyTransactionsDetails, PharmacySupplyTransactionDetailCommand> {
    private AdditionalSupplyTnxDetailToAdditionalTxnDetailCommand additionalSupplyTnxDetailToAdditionalTxnDetailCommand;

    public PharmSupplyTxnDetailToPharmSupplyTxnDetailCommand(AdditionalSupplyTnxDetailToAdditionalTxnDetailCommand additionalSupplyTnxDetailToAdditionalTxnDetailCommand) {
        this.additionalSupplyTnxDetailToAdditionalTxnDetailCommand = additionalSupplyTnxDetailToAdditionalTxnDetailCommand;
    }

    @Nullable
    @Override
    public PharmacySupplyTransactionDetailCommand convert(PharmacySupplyTransactionsDetails source) {
        if(source==null)
        return null;

        final PharmacySupplyTransactionDetailCommand details = new PharmacySupplyTransactionDetailCommand();
        details.setId(source.getId());

        if(source.getPharmacyProducts()!=null){
            details.setPharmacyProductId(source.getPharmacyProducts().getId());
        }

        if(source.getAdditionalSupplyTransactionDetails().size()> 0 && source.getAdditionalSupplyTransactionDetails()!=null)
            source.getAdditionalSupplyTransactionDetails().forEach(additionalTransactionDetailCommand ->
                    details.getAdditionalSupplyTransactionDetailCommands().add(
                            additionalSupplyTnxDetailToAdditionalTxnDetailCommand.convert(
                                    additionalTransactionDetailCommand
                            )
                    ));

        if(source.getPharmacySupplyTransactions()!=null){
            details.setPharmacySupplyTransactionId(source.getPharmacySupplyTransactions().getId());
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
