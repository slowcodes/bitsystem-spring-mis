package ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank.BloodBankTransactionCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransaction;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class BBTxnCommandToBBTxn implements Converter<BloodBankTransactionCommand, BloodbankTransaction> {
    private BBTxnDetailCommandToBBTxnDetail bbTxnDetailCommandToBBTxnDetail;

    @Nullable
    @Override
    public BloodbankTransaction convert(BloodBankTransactionCommand source) {
        if(source==null)
            return null;

        final BloodbankTransaction transaction=new BloodbankTransaction();
        transaction.setComment(source.getComment());
        transaction.setDateTransaction(source.getDateTransaction());
        transaction.setDiscount(source.getDiscount());
        transaction.setId(source.getId());
        transaction.setTimeOfTransaction(source.getTimeOfTransaction());

        if(source.getBloodBankTransactionDetailCommands()!=null && source.getBloodBankTransactionDetailCommands().size()>0)
            source.getBloodBankTransactionDetailCommands().forEach(bloodBankTransactionDetailCommand ->
                    transaction.getBloodbankTransactionDetails().add(
                            bbTxnDetailCommandToBBTxnDetail.convert(bloodBankTransactionDetailCommand)
                    ));

        if(source.getUserId()!= null){
            Users users=new Users();
            users.setId(source.getUserId());
            transaction.setUsers(users);
            Users user = users.addBloodBankTransaction(transaction);
        }

        if(source.getPatientId()!=null){
            Patients patient = new Patients();
            patient.setId(source.getPatientId());
            transaction.setPatients(patient);
            Patients patients = patient.addBloodBankTransaction(transaction);
        }

        return transaction;
    }
}
