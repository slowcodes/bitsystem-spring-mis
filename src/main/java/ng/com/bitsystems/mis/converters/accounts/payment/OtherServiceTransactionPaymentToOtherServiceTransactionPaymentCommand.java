package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.OtherServiceTransactionPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.OtherServicePayments;
import org.springframework.core.convert.converter.Converter;

public class OtherServiceTransactionPaymentToOtherServiceTransactionPaymentCommand implements Converter<OtherServicePayments, OtherServiceTransactionPaymentCommand> {
    @Override
    public OtherServiceTransactionPaymentCommand convert(OtherServicePayments source) {
        return null;
    }
}
