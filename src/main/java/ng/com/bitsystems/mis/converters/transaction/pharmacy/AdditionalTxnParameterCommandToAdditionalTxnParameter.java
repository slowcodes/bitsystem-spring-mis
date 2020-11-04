package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalTransactionParameterCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionParameters;
import org.springframework.core.convert.converter.Converter;

public class AdditionalTxnParameterCommandToAdditionalTxnParameter implements
        Converter<AdditionalTransactionParameterCommand, AdditionalTransactionParameters> {
    private AdditionalTxnDetailCommandToAdditionTnxDetail additionalTxnDetailCommandToAdditionTnxDetail;

    public AdditionalTxnParameterCommandToAdditionalTxnParameter(AdditionalTxnDetailCommandToAdditionTnxDetail additionalTxnDetailCommandToAdditionTnxDetail) {
        this.additionalTxnDetailCommandToAdditionTnxDetail = additionalTxnDetailCommandToAdditionTnxDetail;
    }
    @Override
    public AdditionalTransactionParameters convert(AdditionalTransactionParameterCommand source) {
        if(source==null)
            return null;

        AdditionalTransactionParameters command=new AdditionalTransactionParameters();

        command.setId(source.getId());
        command.setDataType(source.getDataType());
        command.setDescription(source.getDescription());
        command.setParameter(command.getParameter());

        if (source.getAdditionalTransactionDetailCommand().size()>0 && source.getAdditionalTransactionDetailCommand()!=null)
            source.getAdditionalTransactionDetailCommand().forEach(additionalTransactionDetails ->
                    command.getAdditionalTransactionDetails().add(
                            additionalTxnDetailCommandToAdditionTnxDetail.convert(
                                    additionalTransactionDetails
                            )
                    ));

        return command;
    }
}
