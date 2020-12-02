package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalTransactionParameterCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionParameters;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class AdditionalTxnParameterToAdditionalTxnParameterCommand implements Converter<AdditionalTransactionParameters, AdditionalTransactionParameterCommand> {
    private AdditionSaleTnxDetailToAdditionalTxnDetailCommand additionSaleTnxDetailToAdditionalTxnDetailCommand;
    private AdditionalSupplyTnxDetailToAdditionalTxnDetailCommand additionalSupplyTnxDetailToAdditionalTxnDetailCommand;

    public AdditionalTxnParameterToAdditionalTxnParameterCommand(AdditionSaleTnxDetailToAdditionalTxnDetailCommand additionSaleTnxDetailToAdditionalTxnDetailCommand
    ,AdditionalSupplyTnxDetailToAdditionalTxnDetailCommand additionalSupplyTnxDetailToAdditionalTxnDetailCommand) {
        this.additionSaleTnxDetailToAdditionalTxnDetailCommand = additionSaleTnxDetailToAdditionalTxnDetailCommand;
        this.additionalSupplyTnxDetailToAdditionalTxnDetailCommand =additionalSupplyTnxDetailToAdditionalTxnDetailCommand;
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

        if (source.getAdditionalSaleTransactionDetails().size()>0 && source.getAdditionalSaleTransactionDetails()!=null)
            source.getAdditionalSaleTransactionDetails().forEach(additionalTransactionDetails ->
                    command.getAdditionalSalesTransactionDetailCommand().add(
                            additionSaleTnxDetailToAdditionalTxnDetailCommand.convert(
                                    additionalTransactionDetails
                            )
                    ));

        if (source.getAdditionalSupplyTransactionDetails().size()>0 && source.getAdditionalSupplyTransactionDetails()!=null)
            source.getAdditionalSupplyTransactionDetails().forEach(additionalTransactionDetails ->
                    command.getAdditionalSupplyTransactionDetailCommand().add(
                            additionalSupplyTnxDetailToAdditionalTxnDetailCommand.convert(
                                    additionalTransactionDetails
                            )
                    ));

        return command;
    }
}
