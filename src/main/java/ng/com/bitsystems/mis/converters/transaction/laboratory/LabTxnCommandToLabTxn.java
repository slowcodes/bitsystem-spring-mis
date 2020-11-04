package ng.com.bitsystems.mis.converters.transaction.laboratory;

import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class LabTxnCommandToLabTxn implements Converter<LaboratoryTransactionCommand, LaboratoryTransaction> {
    private LabTxnDetailCommandToLabTxnDetail labTxnDetailCommandToLabTxnDetail;


    @Override
    @Nullable
    public LaboratoryTransaction convert(LaboratoryTransactionCommand source) {

        if(source==null){
            return null;
        }

        final LaboratoryTransaction transaction=new LaboratoryTransaction();

        transaction.setComment(source.getComment());
        transaction.setDateTransaction(source.getDateTransaction());
        transaction.setDiscount(source.getDiscount());
        transaction.setId(source.getId());
        transaction.setTimeOfTransaction(source.getTimeOfTransaction());
        transaction.setProvisonalDiagnosis(source.getProvisionalDiagnosis());
        transaction.setPresentingComplaint(source.getPresentingComplaint());

        if(source.getLaboratoryTransactionDetailCommands()!=null && source.getLaboratoryTransactionDetailCommands().size()>0)
            source.getLaboratoryTransactionDetailCommands().forEach(laboratoryTransactionDetailCommand ->
                    transaction.getLaboratoryTransactionDetails().add(
                            labTxnDetailCommandToLabTxnDetail.convert(laboratoryTransactionDetailCommand)
                    ));

        if(source.getUserId()!= null){
            Users users=new Users();
            users.setId(source.getUserId());
            transaction.setUsers(users);
            Users user = users.addLabTransaction(transaction);
        }

        if(source.getPatientId()!=null){
            Patients patient = new Patients();
            patient.setId(source.getPatientId());
            transaction.setPatients(patient);
            Patients patients = patient.addLabTransaction(transaction);
        }
        return null;
    }
}
