package ng.com.bitsystems.mis.converters.transaction.otherservice;

import ng.com.bitsystems.mis.command.transactions.otherservice.OtherServiceTransactionCommand;
import ng.com.bitsystems.mis.converters.transaction.TransactionCommandToTransaction;
import ng.com.bitsystems.mis.models.transactions.otherservices.OtherServiceTransaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class OtherSrvTxnCommandToOtherSrvTxn implements Converter<OtherServiceTransactionCommand, OtherServiceTransaction> {
    private TransactionCommandToTransaction transactionCommandToTransaction;
    private OtherSrvTxnDetailCommandToOtherSrvTxnDetail otherSrvTxnDetailCommandToOtherSrvTxnDetail;

    public OtherSrvTxnCommandToOtherSrvTxn(TransactionCommandToTransaction transactionCommandToTransaction,
                                           OtherSrvTxnDetailCommandToOtherSrvTxnDetail otherSrvTxnDetailCommandToOtherSrvTxnDetail) {
        this.transactionCommandToTransaction = transactionCommandToTransaction;
        this.otherSrvTxnDetailCommandToOtherSrvTxnDetail = otherSrvTxnDetailCommandToOtherSrvTxnDetail;
    }

    @Override
    public OtherServiceTransaction convert(OtherServiceTransactionCommand source) {
        if(source==null)
            return null;

        OtherServiceTransaction otherServiceTransaction = new OtherServiceTransaction();
        otherServiceTransaction.setId(otherServiceTransaction.getId());

//        if(source.getPatientId()==null){
//            Patients patients = new Patients();
//            patients.setId(source.getPatientId());
//            otherServiceTransaction.setPatients(patients);
//            Patients patient = patients.addOtherServiceTransaction(otherServiceTransaction);
//        }

//        if(source.getReferralId()==null){
//            Referrals referrals = new Referrals();
//            referrals.setId(source.getReferralId());
//            otherServiceTransaction.setReferral(referrals);
//            Referrals referral = referrals.addOtherServiceTransaction(otherServiceTransaction);
//        }

        otherServiceTransaction.setTransaction(transactionCommandToTransaction.convert(source.getTransactionCommand()));
        if(source.getOtherServiceTransactionDetailsCommands().size()>0 && source.getOtherServiceTransactionDetailsCommands()!=null)
            source.getOtherServiceTransactionDetailsCommands().forEach(detailCommand ->
                    otherServiceTransaction.getOtherServiceTransactionsDetails().add(
                            otherSrvTxnDetailCommandToOtherSrvTxnDetail.convert(detailCommand)
                    ));

        return otherServiceTransaction;
    }
}
