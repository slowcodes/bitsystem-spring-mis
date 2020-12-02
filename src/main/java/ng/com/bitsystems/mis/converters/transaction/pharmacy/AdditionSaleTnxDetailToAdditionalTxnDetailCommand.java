package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalSalesTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalSaleTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class AdditionSaleTnxDetailToAdditionalTxnDetailCommand implements Converter<AdditionalSaleTransactionDetails,
        AdditionalSalesTransactionDetailCommand> {


    @Nullable
    @Override
    public AdditionalSalesTransactionDetailCommand convert(AdditionalSaleTransactionDetails source) {
        if(source==null)
            return null;
        AdditionalSalesTransactionDetailCommand command = new AdditionalSalesTransactionDetailCommand();
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
