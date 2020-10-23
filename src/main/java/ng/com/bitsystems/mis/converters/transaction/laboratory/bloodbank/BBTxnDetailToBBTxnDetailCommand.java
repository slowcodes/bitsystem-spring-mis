package ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank.BloodBankTransactionDetailCommand;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransactionDetails;
import org.springframework.core.convert.converter.Converter;

public class BBTxnDetailToBBTxnDetailCommand implements
        Converter<BloodbankTransactionDetails, BloodBankTransactionDetailCommand> {
    @Override
    public BloodBankTransactionDetailCommand convert(BloodbankTransactionDetails source) {
        return null;
    }
}
