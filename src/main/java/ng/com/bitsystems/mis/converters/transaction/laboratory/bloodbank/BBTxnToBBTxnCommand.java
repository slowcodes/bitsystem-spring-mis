package ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank.BloodBankTransactionCommand;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransaction;
import org.springframework.core.convert.converter.Converter;

public class BBTxnToBBTxnCommand implements Converter<BloodbankTransaction, BloodBankTransactionCommand> {
    @Override
    public BloodBankTransactionCommand convert(BloodbankTransaction source) {
        return null;
    }
}
