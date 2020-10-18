package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredBloodBankTransactionCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredBloodbankTransactions;
import org.springframework.core.convert.converter.Converter;

public class InsuredBBTxnCmdToInsuredBBTxn implements
        Converter<InsuredBloodBankTransactionCommand, InsuredBloodbankTransactions> {
    @Override
    public InsuredBloodbankTransactions convert(InsuredBloodBankTransactionCommand source) {
        return null;
    }
}
