package ng.com.bitsystems.mis.converters.accounts.payment.insurance;

import ng.com.bitsystems.mis.command.accounts.payments.insurrance.InsuredVaccinationTransactionCommand;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredVaccinationTransactions;
import org.springframework.core.convert.converter.Converter;

public class InsuredVaccTxnToInsuredVaccTxnCmd implements Converter<InsuredVaccinationTransactions, InsuredVaccinationTransactionCommand> {
    @Override
    public InsuredVaccinationTransactionCommand convert(InsuredVaccinationTransactions source) {
        return null;
    }
}
