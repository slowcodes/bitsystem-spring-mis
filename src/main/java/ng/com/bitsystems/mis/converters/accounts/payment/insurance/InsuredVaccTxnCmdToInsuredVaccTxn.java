package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredVaccinationTransactionCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredVaccinationTransactions;
import org.springframework.core.convert.converter.Converter;

public class InsuredVaccTxnCmdToInsuredVaccTxn implements Converter<InsuredVaccinationTransactionCommand, InsuredVaccinationTransactions> {
    @Override
    public InsuredVaccinationTransactions convert(InsuredVaccinationTransactionCommand source) {
        return null;
    }
}
