package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySupplyTransactionCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactions;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class PharmSupplyTxnCommandToPharmSupplyTxn implements
        Converter<PharmacySupplyTransactionCommand, PharmacySupplyTransactions> {
    private PharmSupplyTxnDetailCommandToPharmSupplyTxnDetail pharmSupplyTxnDetailCommandToPharmSupplyTxnDetail;

    public PharmSupplyTxnCommandToPharmSupplyTxn(PharmSupplyTxnDetailCommandToPharmSupplyTxnDetail pharmSupplyTxnDetailCommandToPharmSupplyTxnDetail) {
        this.pharmSupplyTxnDetailCommandToPharmSupplyTxnDetail = pharmSupplyTxnDetailCommandToPharmSupplyTxnDetail;
    }

    @Nullable
    @Override
    public PharmacySupplyTransactions convert(PharmacySupplyTransactionCommand source) {
        if(source==null)
            return null;

        final PharmacySupplyTransactions transaction =new PharmacySupplyTransactions();
        transaction.setId(source.getId());

        transaction.setComment(source.getComment());
        transaction.setDateTransaction(source.getDateTransaction());
        transaction.setDiscount(source.getDiscount());
        transaction.setId(source.getId());
        transaction.setTimeOfTransaction(source.getTimeOfTransaction());
        //transaction.setBuyingPrice(source.getBuyingPrice());


        if(source.getPharmacySupplyTransactionDetailCommands()!=null && source.getPharmacySupplyTransactionDetailCommands().size()>0)
            source.getPharmacySupplyTransactionDetailCommands().forEach(pharmacySupplyTransactionDetailCommand ->
                    transaction.getPharmacySupplyTransactionsDetails().add(
                            pharmSupplyTxnDetailCommandToPharmSupplyTxnDetail.convert(
                                    pharmacySupplyTransactionDetailCommand
                            )
                    ));

        if(source.getUserId()!= null){
            Users users=new Users();
            users.setId(source.getUserId());
            transaction.setUsers(users);
            Users user = users.addPharmSupplyTransaction(transaction);
        }

        if(source.getPatientId()!=null){
            Patients patient = new Patients();
            patient.setId(source.getPatientId());
            transaction.setPatients(patient);
            Patients patients = patient.addPharmSupplyTransaction(transaction);
        }

        return transaction;
    }
}
