package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.AdditionalTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.pharmacy.AdditionalTransactionDetails;
import org.springframework.core.convert.converter.Converter;

public class AdditionalTxnDetailCommandToAdditionTnxDetail implements
        Converter<AdditionalTransactionDetailCommand, AdditionalTransactionDetails> {
    @Override
    public AdditionalTransactionDetails convert(AdditionalTransactionDetailCommand source) {
        return null;
    }
}
