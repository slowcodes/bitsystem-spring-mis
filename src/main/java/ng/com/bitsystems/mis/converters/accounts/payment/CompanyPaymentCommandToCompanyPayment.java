package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.CompanyPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.CompanyPayments;
import ng.com.bitsystems.mis.models.patients.CompanyFolder;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CompanyPaymentCommandToCompanyPayment implements Converter<CompanyPaymentCommand, CompanyPayments> {

    private PaymentCommandToPayment paymentCommandToPayment;

    public CompanyPaymentCommandToCompanyPayment(PaymentCommandToPayment paymentCommandToPayment) {
        this.paymentCommandToPayment = paymentCommandToPayment;
    }

    @Override
    public CompanyPayments convert(CompanyPaymentCommand source) {
        if(source==null){
            return null;
        }

        final CompanyPayments companyPayments = new CompanyPayments();
        companyPayments.setId(source.getId());

//        if(source.getTransactionId() != null) {
//            Transaction transaction = new Transaction();
//            transaction.setId(source.getTransactionId());
//            companyPayments.setTransaction(transaction);
//            Transaction transactions = transaction.addCompanyPayment(companyPayments);
//        }

        if(source.getCompanyId() != null){
            CompanyFolder companyFolder = new CompanyFolder();
            companyFolder.setId(source.getCompanyId());
            companyPayments.setCompany(companyFolder);
            CompanyFolder folder = companyFolder.addCompanyPayments(companyPayments);
        }

        //companyPayments.setTransactionType(source.getTransactionType());
        //companyPayments.setPayments(paymentCommandToPayment.convert(source.getPaymentCommand()));

        return companyPayments;
    }
}
