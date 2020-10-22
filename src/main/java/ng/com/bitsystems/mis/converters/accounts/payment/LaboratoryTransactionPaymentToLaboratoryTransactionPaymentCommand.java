package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.LaboratoryTransactionPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.LaboratoryTransactionPayments;
import org.springframework.core.convert.converter.Converter;

public class LaboratoryTransactionPaymentToLaboratoryTransactionPaymentCommand
implements Converter<LaboratoryTransactionPayments, LaboratoryTransactionPaymentCommand> {
    @Override
    public LaboratoryTransactionPaymentCommand convert(LaboratoryTransactionPayments source) {
        return null;
    }
}
