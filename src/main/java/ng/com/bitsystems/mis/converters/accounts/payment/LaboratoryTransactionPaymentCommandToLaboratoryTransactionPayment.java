package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.LaboratoryTransactionPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.LaboratoryTransactionPayments;
import org.springframework.core.convert.converter.Converter;

public class LaboratoryTransactionPaymentCommandToLaboratoryTransactionPayment
implements Converter<LaboratoryTransactionPaymentCommand, LaboratoryTransactionPayments> {
    @Override
    public LaboratoryTransactionPayments convert(LaboratoryTransactionPaymentCommand source) {
        return null;
    }
}
