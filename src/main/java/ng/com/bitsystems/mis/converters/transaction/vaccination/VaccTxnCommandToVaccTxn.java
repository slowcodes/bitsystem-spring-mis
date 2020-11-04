package ng.com.bitsystems.mis.converters.transaction.vaccination;

import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class VaccTxnCommandToVaccTxn implements
        Converter<VaccinationTransactionCommand, VaccinationTransaction> {
    @Override
    public VaccinationTransaction convert(VaccinationTransactionCommand source) {
        if(source==null)
            return null;

        final VaccinationTransaction transaction=new VaccinationTransaction();
        transaction.setComment(source.getComment());
        transaction.setDateTransaction(source.getDateTransaction());
        transaction.setDiscount(source.getDiscount());
        transaction.setId(source.getId());
        transaction.setTimeOfTransaction(source.getTimeOfTransaction());

        if(source.getUserId()!= null){
            Users users=new Users();
            users.setId(source.getUserId());
            transaction.setUsers(users);
            Users user = users.addVccTransaction(transaction);
        }

        if(source.getPatientId()!=null){
            Patients patient = new Patients();
            patient.setId(source.getPatientId());
            transaction.setPatients(patient);
            Patients patients = patient.addVccTransaction(transaction);
        }

        return transaction;
    }
}
