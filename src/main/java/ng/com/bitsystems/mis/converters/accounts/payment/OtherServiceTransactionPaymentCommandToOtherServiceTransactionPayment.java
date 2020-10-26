package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.OtherServiceTransactionPaymentCommand;
import ng.com.bitsystems.mis.converters.accounts.OtherServiceCommandToOtherService;
import ng.com.bitsystems.mis.models.accounts.payments.OtherServicePayments;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class OtherServiceTransactionPaymentCommandToOtherServiceTransactionPayment
        implements Converter<OtherServiceTransactionPaymentCommand, OtherServicePayments> {

    private OtherServiceCommandToOtherService otherServiceCommandToOtherService;

    public OtherServiceTransactionPaymentCommandToOtherServiceTransactionPayment(OtherServiceCommandToOtherService otherServiceCommandToOtherService) {
        this.otherServiceCommandToOtherService = otherServiceCommandToOtherService;
    }

    @Override
    public OtherServicePayments convert(OtherServiceTransactionPaymentCommand source) {

        if(source == null){
            return null;
        }
        OtherServicePayments otherServicePayments = new OtherServicePayments();
        otherServicePayments.setId(source.getId());
        otherServicePayments.setOtherServices(otherServiceCommandToOtherService.convert(source.getOtherServiceCommand()));
        if(source.getUserId() != null){
            Users users = new Users();
            users.setId(source.getUserId());
            otherServicePayments.setUsers(users);
            Users usr = users.addOtherServicePayment(otherServicePayments);
        }
        otherServicePayments.setAmountPaid(source.getAmountPaid());
        otherServicePayments.setComment(source.getComment());
        otherServicePayments.setDateOfPayment(source.getDateOfPayment());
        otherServicePayments.setTimeOfPayment(source.getTimeOfPayment());
        otherServicePayments.setPaymentMethod(source.getPaymentMethod());
        otherServicePayments.setPaymentType(source.getPaymentType());

        return otherServicePayments;
    }
}
