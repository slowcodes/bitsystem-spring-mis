package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.CompanyPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.CompanyPayments;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CompanyPaymentToCompanyPaymentCommand implements Converter<CompanyPayments, CompanyPaymentCommand> {

    private PaymentToPaymentCommand paymentToPaymentCommand;

    public CompanyPaymentToCompanyPaymentCommand(PaymentToPaymentCommand paymentToPaymentCommand) {
        this.paymentToPaymentCommand = paymentToPaymentCommand;
    }

    @Override
    public CompanyPaymentCommand convert(CompanyPayments source) {
        if(source==null){
            return null;
        }
        CompanyPaymentCommand companyPaymentCommand = new CompanyPaymentCommand();
        companyPaymentCommand.setId(source.getId());

        if (source.getTransaction() !=null) {
            companyPaymentCommand.setTransactionId(source.getTransaction().getId());
        }

        if (source.getCompany()!=null) {
            companyPaymentCommand.setCompanyId(source.getCompany().getId());
        }

        //companyPaymentCommand.setTransactionType(source.getTransactionType());
        return companyPaymentCommand;
    }
}
