package ng.com.bitsystems.mis.converters.accounts.payment;

import ng.com.bitsystems.mis.command.accounts.payments.BloodBankDonationPaymentCommand;
import ng.com.bitsystems.mis.converters.laboratory.bloodbank.DonationQueueCommandToDonationQueue;
import ng.com.bitsystems.mis.models.accounts.payments.BloodbankDonationPayments;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class BloodBankDonationPaymentCommandToBloodBankDonationPayment implements Converter<BloodBankDonationPaymentCommand, BloodbankDonationPayments> {
    private DonationQueueCommandToDonationQueue donationQueueCommandToDonationQueue;

    public BloodBankDonationPaymentCommandToBloodBankDonationPayment(DonationQueueCommandToDonationQueue donationQueueCommandToDonationQueue) {
        this.donationQueueCommandToDonationQueue = donationQueueCommandToDonationQueue;
    }

    @Override
    public BloodbankDonationPayments convert(BloodBankDonationPaymentCommand source) {

        if(source==null){
            return null;
        }

        final BloodbankDonationPayments payments = new BloodbankDonationPayments();

        payments.setId(source.getId());
        payments.setDonationQueue(donationQueueCommandToDonationQueue.convert(source.getDonationQueueCommand()));
        payments.setAmountPaid(source.getAmountPaid());
        payments.setComment(source.getComment());
        payments.setPaymentMethod(source.getPaymentMethod());
        payments.setPaymentType(source.getPaymentType());

        if(source.getUserId() != null){
            Users users = new Users();
            users.setId(source.getUserId());
            payments.setUsers(users);
            users.addBloodBankPayment(payments);
        }

        return payments;
    }
}
