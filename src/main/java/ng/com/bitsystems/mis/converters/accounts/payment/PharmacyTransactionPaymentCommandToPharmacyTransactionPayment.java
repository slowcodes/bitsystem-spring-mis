package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.PharmacyTransactionPaymentCommand;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.PharmSalesTxnCommandToPharmSaleTxn;
import ng.com.bitsystems.mis.models.accounts.payments.PharmacyTransactionPayments;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class PharmacyTransactionPaymentCommandToPharmacyTransactionPayment implements Converter<PharmacyTransactionPaymentCommand, PharmacyTransactionPayments> {

    private PharmSalesTxnCommandToPharmSaleTxn pharmSalesTxnCommandToPharmSaleTxn;

    public PharmacyTransactionPaymentCommandToPharmacyTransactionPayment(PharmSalesTxnCommandToPharmSaleTxn pharmSalesTxnCommandToPharmSaleTxn) {
        this.pharmSalesTxnCommandToPharmSaleTxn = pharmSalesTxnCommandToPharmSaleTxn;
    }

    @Override
    public PharmacyTransactionPayments convert(PharmacyTransactionPaymentCommand source) {
        if (source== null){
            return null;
        }
        final PharmacyTransactionPayments payments = new PharmacyTransactionPayments();
        payments.setId(payments.getId());
        payments.setPaymentType(payments.getPaymentType());
        if(source.getUserId()!=null){
            Users users = new Users();
            users.setId(source.getUserId());
            payments.setUsers(users);
            Users usr = users.addPharmacyPayment(payments);
        }
        payments.setPharmacySalesTransaction(pharmSalesTxnCommandToPharmSaleTxn.convert(source.getPharmacySalesTransactionCommand()));
        payments.setPaymentType(source.getPaymentType());
        payments.setAmountPaid(source.getAmountPaid());
        payments.setPaymentMethod(source.getPaymentMethod());
        payments.setComment(source.getComment());
        payments.setDateOfPayment(source.getDateOfPayment());
        payments.setTimeOfPayment(source.getTimeOfPayment());
        return payments;
    }
}
