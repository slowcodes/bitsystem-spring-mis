package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.BloodBankDonationPaymentCommand;
import ng.com.bitsystems.mis.models.accounts.payments.BloodbankDonationPayments;
import org.springframework.core.convert.converter.Converter;

public class BloodBankDonationPaymentToBloodBankDonationPaymentCommad
implements Converter<BloodbankDonationPayments, BloodBankDonationPaymentCommand> {
    @Override
    public BloodBankDonationPaymentCommand convert(BloodbankDonationPayments source) {
        return null;
    }
}
