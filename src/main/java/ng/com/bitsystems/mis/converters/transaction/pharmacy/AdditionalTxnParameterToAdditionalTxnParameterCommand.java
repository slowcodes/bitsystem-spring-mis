package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalTransactionParameterCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionParameters;
import org.springframework.core.convert.converter.Converter;

public class AdditionalTxnParameterToAdditionalTxnParameterCommand implements Converter<AdditionalTransactionParameters, AdditionalTransactionParameterCommand> {
    @Override
    public AdditionalTransactionParameterCommand convert(AdditionalTransactionParameters source) {
        return null;
    }
}
