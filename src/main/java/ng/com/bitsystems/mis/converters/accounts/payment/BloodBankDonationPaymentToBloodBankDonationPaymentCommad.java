package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.BloodBankDonationPaymentCommand;
import ng.com.bitsystems.mis.converters.laboratory.bloodbank.DonationQueueToDonationQueueCommand;
import ng.com.bitsystems.mis.models.accounts.payments.BloodbankDonationPayments;
import org.springframework.core.convert.converter.Converter;

public class BloodBankDonationPaymentToBloodBankDonationPaymentCommad
implements Converter<BloodbankDonationPayments, BloodBankDonationPaymentCommand> {

    private DonationQueueToDonationQueueCommand donationQueueToDonationQueueCommand;

    public BloodBankDonationPaymentToBloodBankDonationPaymentCommad(DonationQueueToDonationQueueCommand donationQueueToDonationQueueCommand) {
        this.donationQueueToDonationQueueCommand = donationQueueToDonationQueueCommand;
    }

    @Override
    public BloodBankDonationPaymentCommand convert(BloodbankDonationPayments source) {
        if(source==null){
            return null;
        }
        final BloodBankDonationPaymentCommand payments = new BloodBankDonationPaymentCommand();
        payments.setId(source.getId());
        if(source.getUsers() != null)
            payments.setUserId(source.getUsers().getId());
        payments.setAmountPaid(source.getAmountPaid());
        payments.setComment(source.getComment());
        payments.setDonationQueueCommand(donationQueueToDonationQueueCommand.convert(source.getDonationQueue()));
        payments.setPaymentMethod(source.getPaymentMethod());
        payments.setPaymentType(source.getPaymentType());
        return payments;
    }
}
