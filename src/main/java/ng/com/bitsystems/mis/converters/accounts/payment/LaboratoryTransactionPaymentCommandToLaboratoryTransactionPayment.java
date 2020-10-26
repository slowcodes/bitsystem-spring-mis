package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.LaboratoryTransactionPaymentCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnCommandToLabTxn;
import ng.com.bitsystems.mis.models.accounts.payments.LaboratoryTransactionPayments;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class LaboratoryTransactionPaymentCommandToLaboratoryTransactionPayment
implements Converter<LaboratoryTransactionPaymentCommand, LaboratoryTransactionPayments> {
    private LabTxnCommandToLabTxn labTxnCommandToLabTxn;

    public LaboratoryTransactionPaymentCommandToLaboratoryTransactionPayment(LabTxnCommandToLabTxn labTxnCommandToLabTxn) {
        this.labTxnCommandToLabTxn = labTxnCommandToLabTxn;
    }

    @Override
    public LaboratoryTransactionPayments convert(LaboratoryTransactionPaymentCommand source) {
        if(source==null){
            return null;
        }
        final LaboratoryTransactionPayments labPayment = new LaboratoryTransactionPayments();
        labPayment.setId(source.getId());
        labPayment.setLaboratoryTransaction(labTxnCommandToLabTxn.convert(source.getLaboratoryTransactionCommand()));
        if (source.getUserId() != null){
            Users users = new Users();
            users.setId(source.getUserId());
            labPayment.setUsers(users);
            Users usr = users.addLabPayment(labPayment);
        }
        labPayment.setAmountPaid(source.getAmountPaid());
        labPayment.setComment(source.getComment());
        labPayment.setDateOfPayment(source.getDateOfPayment());
        labPayment.setPaymentMethod(source.getPaymentMethod());
        labPayment.setPaymentType(source.getPaymentType());
        labPayment.setTimeOfPayment(source.getTimeOfPayment());
        return labPayment;
    }
}
