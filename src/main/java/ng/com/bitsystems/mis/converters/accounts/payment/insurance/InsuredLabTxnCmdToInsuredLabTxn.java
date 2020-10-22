package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredLaboratoryTransactionCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredLaboratoryTransactions;
import org.springframework.core.convert.converter.Converter;

public class InsuredLabTxnCmdToInsuredLabTxn implements Converter<InsuredLaboratoryTransactionCommand, InsuredLaboratoryTransactions> {
    @Override
    public InsuredLaboratoryTransactions convert(InsuredLaboratoryTransactionCommand source) {
        return null;
    }
}
