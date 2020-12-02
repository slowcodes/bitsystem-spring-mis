package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalSupplyTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalSupplyTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class AdditionalSupplyTnxDetailToAdditionalTxnDetailCommand implements Converter<
        AdditionalSupplyTransactionDetails, AdditionalSupplyTransactionDetailCommand> {


    @Nullable
    @Override
    public AdditionalSupplyTransactionDetailCommand convert(AdditionalSupplyTransactionDetails source) {
        if(source==null)
            return null;
        AdditionalSupplyTransactionDetailCommand command = new AdditionalSupplyTransactionDetailCommand();
        command.setId(source.getId());

        if(source.getPharmacySupplyTransactionsDetails()!=null){
            command.setPharmSupplyTxnDetailId(source.getPharmacySupplyTransactionsDetails().getId());
        }

        if(source.getTransactionParameters()!=null){
            command.setParameterId(source.getTransactionParameters().getId());
        }

        command.setShowInReciept(source.getShowInReciept());
        command.setValue(source.getValue());

        return command;
    }
}
