package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySalesTransactionCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySalesTransaction;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class PharmSalesTxnCommandToPharmSaleTxn implements Converter<PharmacySalesTransactionCommand, PharmacySalesTransaction> {
    private PharmSalesTxnDetailCommandToPharmSalesTxnDetail pharmSalesTxnDetailCommandToPharmSalesTxnDetail;

    public PharmSalesTxnCommandToPharmSaleTxn(PharmSalesTxnDetailCommandToPharmSalesTxnDetail pharmSalesTxnDetailCommandToPharmSalesTxnDetail) {
        this.pharmSalesTxnDetailCommandToPharmSalesTxnDetail = pharmSalesTxnDetailCommandToPharmSalesTxnDetail;
    }

    @Nullable
    @Override
    public PharmacySalesTransaction convert(PharmacySalesTransactionCommand source) {
        if(source==null)
            return null;

        final PharmacySalesTransaction transaction =new PharmacySalesTransaction();
        transaction.setId(source.getId());

        transaction.setComment(source.getComment());
        transaction.setDateTransaction(source.getDateTransaction());
        transaction.setDiscount(source.getDiscount());
        transaction.setId(source.getId());
        transaction.setTimeOfTransaction(source.getTimeOfTransaction());


        if(source.getPharmacySalesTransactionDetailCommands()!=null && source.getPharmacySalesTransactionDetailCommands().size()>0)
            source.getPharmacySalesTransactionDetailCommands().forEach(pharmacySalesTransactionDetailCommand ->
                    transaction.getPharmacyTransactionDetails().add(
                            pharmSalesTxnDetailCommandToPharmSalesTxnDetail.convert(pharmacySalesTransactionDetailCommand)
                    ));

        if(source.getUserId()!= null){
            Users users=new Users();
            users.setId(source.getUserId());
            transaction.setUsers(users);
            Users user = users.addPharmSaleTransaction(transaction);
        }

        if(source.getPatientId()!=null){
            Patients patient = new Patients();
            patient.setId(source.getPatientId());
            transaction.setPatients(patient);
            Patients patients = patient.addPharmSalesTransaction(transaction);
        }

        return transaction;
    }
}
