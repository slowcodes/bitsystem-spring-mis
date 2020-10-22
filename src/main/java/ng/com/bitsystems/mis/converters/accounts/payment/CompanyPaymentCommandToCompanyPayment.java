package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.CompanyPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.CompanyPayments;
import org.springframework.core.convert.converter.Converter;

public class CompanyPaymentCommandToCompanyPayment implements Converter<CompanyPaymentCommand, CompanyPayments> {
    @Override
    public CompanyPayments convert(CompanyPaymentCommand source) {
        return null;
    }
}
