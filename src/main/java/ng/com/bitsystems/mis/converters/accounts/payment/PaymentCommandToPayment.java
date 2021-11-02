package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.PaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.Payments;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PaymentCommandToPayment implements Converter<PaymentCommand, Payments> {

    @Override
    public Payments convert(PaymentCommand source) {
        if (source== null){
            return null;
        }
        final Payments payments = new Payments();
        payments.setId(payments.getId());
        payments.setPaymentType(payments.getPaymentType());
        if(source.getUserId()!=null){
            AppUsers appUsers = new AppUsers();
            appUsers.setId(source.getUserId());
            payments.setAppUsers(appUsers);
            AppUsers usr = appUsers.addPayment(payments);
        }
        payments.setPaymentType(source.getPaymentType());
        payments.setAmountPaid(source.getAmountPaid());
        payments.setPaymentMethod(source.getPaymentMethod());
        payments.setComment(source.getComment());
        payments.setDateOfPayment(source.getDateOfPayment());
        payments.setTimeOfPayment(source.getTimeOfPayment());
        return payments;
    }
}
