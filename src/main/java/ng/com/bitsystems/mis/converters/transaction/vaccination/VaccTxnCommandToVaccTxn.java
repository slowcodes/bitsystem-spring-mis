package ng.com.bitsystems.mis.converters.transaction.vaccination;

import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.TransactionCommandToTransaction;
import ng.com.bitsystems.mis.models.referrals.Referrals;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class VaccTxnCommandToVaccTxn implements
        Converter<VaccinationTransactionCommand, VaccinationTransaction> {
    private TransactionCommandToTransaction transactionCommandToTransaction;
    private VaccTxnDetailCommandToVaccTxnDetail vaccTxnDetailCommandToVaccTxnDetail;

    public VaccTxnCommandToVaccTxn(TransactionCommandToTransaction transactionCommandToTransaction,
                                   VaccTxnDetailCommandToVaccTxnDetail vaccTxnDetailCommandToVaccTxnDetail) {
        this.transactionCommandToTransaction = transactionCommandToTransaction;
        this.vaccTxnDetailCommandToVaccTxnDetail = vaccTxnDetailCommandToVaccTxnDetail;
    }

    @Override
    public VaccinationTransaction convert(VaccinationTransactionCommand source) {
        if(source==null)
            return null;

        final VaccinationTransaction transaction=new VaccinationTransaction();
        transaction.setId(source.getId());
        transaction.setTransaction(transactionCommandToTransaction.convert(source.getTransactionCommand()));


        if(source.getReferralId()==null){
            Referrals referrals = new Referrals();
            referrals.setId(source.getReferralId());
            transaction.setReferral(referrals);
        }

        if(source.getVaccinationTransactionDetailCommand().size()>0 && source.getVaccinationTransactionDetailCommand()!=null)
            source.getVaccinationTransactionDetailCommand().forEach(
                    vaccinationTransactionDetailCommand -> transaction.getVaccinationTransactionsDetails().add(
                            vaccTxnDetailCommandToVaccTxnDetail.convert(vaccinationTransactionDetailCommand)
                    )
            );
        return transaction;
    }
}
