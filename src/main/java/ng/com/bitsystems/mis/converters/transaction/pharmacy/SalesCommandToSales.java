package ng.com.bitsystems.mis.converters.transaction.pharmacy;

import ng.com.bitsystems.mis.command.transactions.pharmacy.SalesCommand;
import ng.com.bitsystems.mis.converters.transaction.TransactionCommandToTransaction;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.referrals.Referrals;
import ng.com.bitsystems.mis.models.transactions.Sales;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SalesCommandToSales implements Converter<SalesCommand, Sales> {
    private TransactionCommandToTransaction transactionCommandToTransaction;

    public SalesCommandToSales(TransactionCommandToTransaction transactionCommandToTransaction) {
        this.transactionCommandToTransaction =transactionCommandToTransaction;
    }

    @Override
    public Sales convert(SalesCommand source) {

        if(source == null)
            return null;

        Sales sales = new Sales();
        sales.setId(source.getId());

        if(source.getPatientId() != null){
            Patients patients = new Patients();
            patients.setId(source.getPatientId());
            sales.setPatients(patients);
            Patients patient = patients.addSales(sales);
        }

        if(source.getReferralId() != null){
            Referrals referrals = new Referrals();
            referrals.setId(source.getReferralId());
            sales.setReferral(referrals);
            Referrals ref = referrals.addSales(sales);
        }
        sales.setTransaction(transactionCommandToTransaction.convert(source.getTransactionCommand()));
        return sales;

    }
}
