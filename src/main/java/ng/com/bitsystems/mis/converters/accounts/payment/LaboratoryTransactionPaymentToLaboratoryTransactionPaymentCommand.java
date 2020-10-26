package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.LaboratoryTransactionPaymentCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnToLabTxnCommand;
import ng.com.bitsystems.mis.models.accounts.payments.LaboratoryTransactionPayments;
import org.springframework.core.convert.converter.Converter;

public class LaboratoryTransactionPaymentToLaboratoryTransactionPaymentCommand
implements Converter<LaboratoryTransactionPayments, LaboratoryTransactionPaymentCommand> {

    private LabTxnToLabTxnCommand labTxnToLabTxnCommand;

    public LaboratoryTransactionPaymentToLaboratoryTransactionPaymentCommand(LabTxnToLabTxnCommand labTxnToLabTxnCommand) {
        this.labTxnToLabTxnCommand = labTxnToLabTxnCommand;
    }

    @Override
    public LaboratoryTransactionPaymentCommand convert(LaboratoryTransactionPayments source) {
        if(source==null){
            return null;
        }
        LaboratoryTransactionPaymentCommand paymentCommand = new LaboratoryTransactionPaymentCommand();
        paymentCommand.setId(source.getId());
        if (source.getUsers() != null){
            paymentCommand.setUserId(source.getUsers().getId());
        }
        paymentCommand.setAmountPaid(source.getAmountPaid());
        paymentCommand.setComment(source.getComment());
        paymentCommand.setDateOfPayment(source.getDateOfPayment());
        paymentCommand.setTimeOfPayment(source.getTimeOfPayment());
        paymentCommand.setPaymentMethod(source.getPaymentMethod());
        paymentCommand.setPaymentType(source.getPaymentType());

        return paymentCommand;
    }
}
