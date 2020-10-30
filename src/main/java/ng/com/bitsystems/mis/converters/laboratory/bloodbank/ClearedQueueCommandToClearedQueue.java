package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.ClearedQueueCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.ClearedQueue;
import ng.com.bitsystems.mis.models.users.Scientists;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;

public class ClearedQueueCommandToClearedQueue implements Converter<ClearedQueueCommand, ClearedQueue> {
    private DonationQueueCommandToDonationQueue donationQueueCommandToDonationQueue;
    @Override
    public ClearedQueue convert(ClearedQueueCommand source) {
        if(source==null){
            return null;
        }
        ClearedQueue clearedQueue=new ClearedQueue();
        clearedQueue.setId(source.getId());
        clearedQueue.setTimeOfClearance(source.getTimeOfClearance());
        if(source.getUserId()!=null){
            Scientists scientists=new Scientists();
            scientists.setId(source.getUserId());
            clearedQueue.setUsers(scientists);
            Users user = scientists.addClearedQueue(clearedQueue);
        }
        clearedQueue.setDonationQueue(donationQueueCommandToDonationQueue.convert(source.getDonationQueueCommand()));

        return clearedQueue;
    }
}
