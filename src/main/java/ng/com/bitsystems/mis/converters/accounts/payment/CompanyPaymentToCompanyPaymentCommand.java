package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.CompanyPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.CompanyPayments;
import org.springframework.core.convert.converter.Converter;

public class CompanyPaymentToCompanyPaymentCommand implements Converter<CompanyPayments, CompanyPaymentCommand> {
    @Override
    public CompanyPaymentCommand convert(CompanyPayments source) {
        if(source==null){
            return null;
        }
        CompanyPaymentCommand companyPaymentCommand = new CompanyPaymentCommand();
        companyPaymentCommand.setId(source.getId());
        companyPaymentCommand.setTransactionId(source.getTransactionId());
        companyPaymentCommand.setTransactionType(source.getTransactionType());
        return companyPaymentCommand;
    }
}
