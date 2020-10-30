package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.ClearedQueueCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.ClearedQueue;
import org.springframework.core.convert.converter.Converter;

public class ClearedQueueToClearedQueueCommand implements Converter<ClearedQueue, ClearedQueueCommand> {
    private DonationQueueToDonationQueueCommand donationQueueToDonationQueueCommand;

    public ClearedQueueToClearedQueueCommand(DonationQueueToDonationQueueCommand donationQueueToDonationQueueCommand) {
        this.donationQueueToDonationQueueCommand = donationQueueToDonationQueueCommand;
    }

    @Override
    public ClearedQueueCommand convert(ClearedQueue source) {
        if(source==null){
            return null;
        }
        final ClearedQueueCommand clearedQueueCommand=new ClearedQueueCommand();
        clearedQueueCommand.setId(source.getId());
        clearedQueueCommand.setDonationQueueCommand(donationQueueToDonationQueueCommand.convert(source.getDonationQueue()));
        clearedQueueCommand.setTimeOfClearance(source.getTimeOfClearance());
        if(source.getUsers()!=null)
            clearedQueueCommand.setUserId(source.getUsers().getId());
        return clearedQueueCommand;
    }
}
