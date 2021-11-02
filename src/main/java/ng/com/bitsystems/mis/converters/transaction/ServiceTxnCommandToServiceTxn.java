package ng.com.bitsystems.mis.converters.transaction;

import ng.com.bitsystems.mis.command.transactions.ServiceTransactionCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.referrals.Referrals;
import ng.com.bitsystems.mis.models.transactions.ServiceTransaction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ServiceTxnCommandToServiceTxn implements Converter<ServiceTransactionCommand, ServiceTransaction> {
    private TransactionCommandToTransaction transactionCommandToTransaction;

    public ServiceTxnCommandToServiceTxn(TransactionCommandToTransaction transactionCommandToTransaction) {
        this.transactionCommandToTransaction = transactionCommandToTransaction;
    }

    @Nullable
    @Override
    public ServiceTransaction convert(ServiceTransactionCommand source) {
        if(source==null)
            return null;

        ServiceTransaction serviceTransaction = new ServiceTransaction();
        serviceTransaction.setId(source.getId());
        serviceTransaction.setUserDiscount(source.getUserDiscount());
        serviceTransaction.setTransaction(transactionCommandToTransaction.convert(source.getTransactionCommand()));

        if(source.getReferralId()!=null){
            Referrals referrals = new Referrals();
            referrals.setId(source.getReferralId());
            serviceTransaction.setReferral(referrals);
        }

        if(source.getPatientId() !=null){
            Patients patients = new Patients();
            patients.setId(source.getPatientId());
            serviceTransaction.setPatients(patients);
            Patients patient = patients.addServiceTransaction(serviceTransaction);
        }
        return serviceTransaction;
    }
}
