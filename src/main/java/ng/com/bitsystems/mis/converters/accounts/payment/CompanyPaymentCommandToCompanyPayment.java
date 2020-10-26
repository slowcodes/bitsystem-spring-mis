package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.CompanyPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.CompanyPayments;
import org.springframework.core.convert.converter.Converter;

public class CompanyPaymentCommandToCompanyPayment implements Converter<CompanyPaymentCommand, CompanyPayments> {


    @Override
    public CompanyPayments convert(CompanyPaymentCommand source) {
        if(source==null){
            return null;
        }
        final CompanyPayments companyPayments = new CompanyPayments();
        companyPayments.setId(source.getId());
        companyPayments.setTransactionId(source.getTransactionId());
        companyPayments.setTransactionType(source.getTransactionType());

        return companyPayments;
    }
}
