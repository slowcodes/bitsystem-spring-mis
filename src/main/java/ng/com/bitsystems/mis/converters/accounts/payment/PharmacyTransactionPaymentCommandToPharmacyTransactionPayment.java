package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.PharmacyTransactionPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.PharmacyTransactionPayments;
import org.springframework.core.convert.converter.Converter;

public class PharmacyTransactionPaymentCommandToPharmacyTransactionPayment implements Converter<PharmacyTransactionPaymentCommand, PharmacyTransactionPayments> {
    @Override
    public PharmacyTransactionPayments convert(PharmacyTransactionPaymentCommand source) {
        return null;
    }
}
