package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.VaccinationTransactionPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.VaccinationTransactionsPayments;
import org.springframework.core.convert.converter.Converter;

public class VaccinationTransactionPaymentCommandToVaccinationTransactionPayment
implements Converter<VaccinationTransactionPaymentCommand, VaccinationTransactionsPayments> {
    @Override
    public VaccinationTransactionsPayments convert(VaccinationTransactionPaymentCommand source) {
        return null;
    }
}
