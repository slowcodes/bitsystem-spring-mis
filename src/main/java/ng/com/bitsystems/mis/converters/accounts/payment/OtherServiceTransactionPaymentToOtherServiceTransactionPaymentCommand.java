package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.OtherServiceTransactionPaymentCommand;
import ng.com.bitsystems.mis.converters.accounts.OtherServiceToOtherServiceCommand;
import ng.com.bitsystems.mis.models.accounts.payments.OtherServicePayments;
import org.springframework.core.convert.converter.Converter;

public class OtherServiceTransactionPaymentToOtherServiceTransactionPaymentCommand implements Converter<OtherServicePayments, OtherServiceTransactionPaymentCommand> {

    private OtherServiceToOtherServiceCommand otherServiceToOtherServiceCommand;

    public OtherServiceTransactionPaymentToOtherServiceTransactionPaymentCommand(OtherServiceToOtherServiceCommand otherServiceToOtherServiceCommand) {
        this.otherServiceToOtherServiceCommand = otherServiceToOtherServiceCommand;
    }

    @Override
    public OtherServiceTransactionPaymentCommand convert(OtherServicePayments source) {
        if (source == null){
            return null;
        }

        OtherServiceTransactionPaymentCommand paymentCommand = new  OtherServiceTransactionPaymentCommand();
        paymentCommand.setId(source.getId());
        if(source.getUsers() != null){
            paymentCommand.setUserId(source.getUsers().getId());
        }
        paymentCommand.setAmountPaid(source.getAmountPaid());
        paymentCommand.setComment(source.getComment());
        paymentCommand.setDateOfPayment(source.getDateOfPayment());
        paymentCommand.setOtherServiceCommand(otherServiceToOtherServiceCommand.convert(source.getOtherServices()));
        paymentCommand.setTimeOfPayment(source.getTimeOfPayment());
        paymentCommand.setPaymentMethod(source.getPaymentMethod());
        paymentCommand.setPaymentType(source.getPaymentType());

        return paymentCommand;
    }
}
