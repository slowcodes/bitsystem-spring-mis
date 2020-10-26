package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.VaccinationTransactionPaymentCommand;
import ng.com.bitsystems.mis.converters.transaction.vaccination.VaccTxnDetailCommandToVaccTxnDetail;
import ng.com.bitsystems.mis.models.accounts.payments.VaccinationTransactionsPayments;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class VaccinationTransactionPaymentCommandToVaccinationTransactionPayment
implements Converter<VaccinationTransactionPaymentCommand, VaccinationTransactionsPayments> {

    private VaccTxnDetailCommandToVaccTxnDetail vaccTxnDetailCommandToVaccTxnDetail;

    public VaccinationTransactionPaymentCommandToVaccinationTransactionPayment(VaccTxnDetailCommandToVaccTxnDetail vaccTxnDetailCommandToVaccTxnDetail) {
        this.vaccTxnDetailCommandToVaccTxnDetail = vaccTxnDetailCommandToVaccTxnDetail;
    }

    @Override
    public VaccinationTransactionsPayments convert(VaccinationTransactionPaymentCommand source) {

        if(source==null){
            return null;
        }
        VaccinationTransactionsPayments payments = new VaccinationTransactionsPayments();
        payments.setId(source.getId());
        if (source.getUserId() !=null){
            Users users = new Users();
            users.setId(source.getUserId());
            users.addVaccinationPayment(payments);
        }
        payments.setVaccinationTransactionsDetails(vaccTxnDetailCommandToVaccTxnDetail.convert(source.getVaccinationTransactionDetailCommand()));
        payments.setAmountPaid(source.getAmountPaid());
        payments.setComment(source.getComment());
        payments.setDateOfPayment(source.getDateOfPayment());
        payments.setPaymentMethod(source.getPaymentMethod());
        payments.setPaymentType(source.getPaymentType());
        return payments;
    }
}
