package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.DonationCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Donations;
import org.springframework.core.convert.converter.Converter;

public class DonationToDonationCommand implements Converter<Donations, DonationCommand> {
    private ClearedQueueToClearedQueueCommand clearedQueueToClearedQueueCommand;

    public DonationToDonationCommand(ClearedQueueToClearedQueueCommand clearedQueueToClearedQueueCommand) {
        this.clearedQueueToClearedQueueCommand = clearedQueueToClearedQueueCommand;
    }

    @Override
    public DonationCommand convert(Donations source) {
        if(source==null){
            return null;
        }
        DonationCommand donationCommand=new DonationCommand();
        donationCommand.setId(source.getId());
        donationCommand.setClearedQueueCommand(clearedQueueToClearedQueueCommand.convert(source.getClearedQueue()));
        if(source.getStorage()!=null){
            donationCommand.setStorageId(source.getStorage().getId());
        }
        donationCommand.setTagId(source.getTagId());
        donationCommand.setTimeOfDonation(source.getTimeOfDonation());
        return  donationCommand;
    }
}
