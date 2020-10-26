package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.VaccinationTransactionPaymentCommand;
import ng.com.bitsystems.mis.converters.transaction.vaccination.VaccTxnDetailToVaccTxnDetailCommand;
import ng.com.bitsystems.mis.models.accounts.payments.VaccinationTransactionsPayments;
import org.springframework.core.convert.converter.Converter;

public class VaccinationTransactionPaymentToVaccinationTransactionPaymentCommand
        implements Converter<VaccinationTransactionsPayments, VaccinationTransactionPaymentCommand> {

    private VaccTxnDetailToVaccTxnDetailCommand vaccTxnDetailToVaccTxnDetailCommand;

    public VaccinationTransactionPaymentToVaccinationTransactionPaymentCommand(VaccTxnDetailToVaccTxnDetailCommand vaccTxnDetailToVaccTxnDetailCommand) {
        this.vaccTxnDetailToVaccTxnDetailCommand = vaccTxnDetailToVaccTxnDetailCommand;
    }

    @Override
    public VaccinationTransactionPaymentCommand convert(VaccinationTransactionsPayments source) {

        if(source== null){
            return null;
        }
        VaccinationTransactionPaymentCommand paymentCommand = new VaccinationTransactionPaymentCommand();
        paymentCommand.setId(source.getId());
        if(source.getUsers() != null){
            paymentCommand.setUserId(source.getUsers().getId());
        }
        paymentCommand.setAmountPaid(source.getAmountPaid());
        paymentCommand.setComment(source.getComment());
        paymentCommand.setDateOfPayment(source.getDateOfPayment());
        paymentCommand.setPaymentMethod(source.getPaymentMethod());
        paymentCommand.setPaymentType(source.getPaymentType());
        paymentCommand.setTimeOfPayment(source.getTimeOfPayment());
        paymentCommand.setVaccinationTransactionDetailCommand(vaccTxnDetailToVaccTxnDetailCommand.convert(source.getVaccinationTransactionsDetails()));
        return paymentCommand;
    }
}
