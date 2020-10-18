package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.OtherServiceTransactionPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.OtherServicePayments;
import org.springframework.core.convert.converter.Converter;

public class OtherServiceTransactionPaymentCommandToOtherServiceTransactionPayment
        implements Converter<OtherServiceTransactionPaymentCommand, OtherServicePayments> {

    @Override
    public OtherServicePayments convert(OtherServiceTransactionPaymentCommand source) {
        return null;
    }
}
