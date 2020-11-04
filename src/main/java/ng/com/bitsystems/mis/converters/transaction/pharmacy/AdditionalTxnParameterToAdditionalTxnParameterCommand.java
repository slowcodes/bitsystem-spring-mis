package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalTransactionParameterCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionParameters;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class AdditionalTxnParameterToAdditionalTxnParameterCommand implements Converter<AdditionalTransactionParameters, AdditionalTransactionParameterCommand> {
    private AdditionTnxDetailToAdditionalTxnDetailCommand additionTnxDetailToAdditionalTxnDetailCommand;

    public AdditionalTxnParameterToAdditionalTxnParameterCommand(AdditionTnxDetailToAdditionalTxnDetailCommand additionTnxDetailToAdditionalTxnDetailCommand) {
        this.additionTnxDetailToAdditionalTxnDetailCommand = additionTnxDetailToAdditionalTxnDetailCommand;
    }

    @Nullable
    @Override
    public AdditionalTransactionParameterCommand convert(AdditionalTransactionParameters source) {
        if(source==null)
            return null;

        AdditionalTransactionParameterCommand command=new AdditionalTransactionParameterCommand();
        command.setId(source.getId());
        command.setDataType(source.getDataType());
        command.setDescription(source.getDescription());
        command.setParameter(command.getParameter());

        if (source.getAdditionalTransactionDetails().size()>0 && source.getAdditionalTransactionDetails()!=null)
            source.getAdditionalTransactionDetails().forEach(additionalTransactionDetails ->
                    command.getAdditionalTransactionDetailCommand().add(
                            additionTnxDetailToAdditionalTxnDetailCommand.convert(
                                    additionalTransactionDetails
                            )
                    ));

        return command;
    }
}
