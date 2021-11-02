package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.PaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.Payments;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PaymentToPaymentCommand implements Converter<Payments, PaymentCommand> {
    @Override
    public PaymentCommand convert(Payments source) {
        if(source== null){
            return null;
        }
        final PaymentCommand paymentCommand = new PaymentCommand();
        paymentCommand.setId(source.getId());
        if(source.getAppUsers() != null)
            paymentCommand.setUserId(source.getAppUsers().getId());
        paymentCommand.setAmountPaid(source.getAmountPaid());
        paymentCommand.setComment(source.getComment());
        paymentCommand.setDateOfPayment(source.getDateOfPayment());
        paymentCommand.setPaymentMethod(source.getPaymentMethod());
        paymentCommand.setTimeOfPayment(source.getTimeOfPayment());
        paymentCommand.setPaymentType(source.getPaymentType());

        return paymentCommand;

    }
}
