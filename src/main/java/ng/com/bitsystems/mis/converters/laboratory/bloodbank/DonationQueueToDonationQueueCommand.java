package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.DonationQueueCommand;
import ng.com.bitsystems.mis.converters.accounts.payment.BloodBankDonationPaymentToBloodBankDonationPaymentCommad;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonationQueue;
import org.springframework.core.convert.converter.Converter;

public class DonationQueueToDonationQueueCommand implements Converter<DonationQueue, DonationQueueCommand> {

    private BloodBankDonationPaymentToBloodBankDonationPaymentCommad paymentCommand;

    @Override
    public DonationQueueCommand convert(DonationQueue source) {
        if(source==null){
            return null;
        }
        DonationQueueCommand donationQueueCommand= new DonationQueueCommand();
        donationQueueCommand.setId(source.getId());
        if(source.getUsers()!=null)
            donationQueueCommand.setUserId(source.getUsers().getId());
        donationQueueCommand.setCompensation(source.getCompensation());

        if(source.getBloodbankDonationPayments().size()>0 && source.getBloodbankDonationPayments()!=null)
            source.getBloodbankDonationPayments().forEach(bloodbankDonationPayments ->
                    donationQueueCommand.getBloodBankDonationPaymentCommand().add(paymentCommand.convert(bloodbankDonationPayments)));

        donationQueueCommand.setStatus(source.getStatus());

        if(source.getDonorRegistry()!=null){
            donationQueueCommand.setDonorRegistryId(source.getDonorRegistry().getId());
        }

        donationQueueCommand.setTimeOfSchedule(source.getTimeOfSchedule());

        return donationQueueCommand;
    }
}
