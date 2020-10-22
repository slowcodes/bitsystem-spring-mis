package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.BloodBankDonationPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.BloodbankDonationPayments;
import org.springframework.core.convert.converter.Converter;

public class BloodBankDonationPaymentCommandToBloodBankDonationPayment implements Converter<BloodBankDonationPaymentCommand, BloodbankDonationPayments> {
    @Override
    public BloodbankDonationPayments convert(BloodBankDonationPaymentCommand source) {
        return null;
    }
}
