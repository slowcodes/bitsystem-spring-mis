package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class AdditionTnxDetailToAdditionalTxnDetailCommand implements Converter<AdditionalTransactionDetails,
        AdditionalTransactionDetailCommand> {


    @Nullable
    @Override
    public AdditionalTransactionDetailCommand convert(AdditionalTransactionDetails source) {
        if(source==null)
            return null;
        AdditionalTransactionDetailCommand command = new AdditionalTransactionDetailCommand();
        command.setId(source.getId());

        if(source.getPharmacyTransactionDetails()!=null){
            command.setPharmSalesTxnDetailId(source.getPharmacyTransactionDetails().getId());
        }

        if(source.getTransactionParameters()!=null){
            command.setParameterId(source.getTransactionParameters().getId());
        }

        command.setShowInReciept(source.getShowInReciept());
        command.setValue(source.getValue());

        return command;
    }
}
