package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.ClearedQueueCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.ClearedQueue;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
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
            AppUsers scientists=new AppUsers();
            scientists.setId(source.getUserId());
            //clearedQueue.setAppUsers(scientists);
            AppUsers user = scientists.addClearedQueue(clearedQueue);
        }
        clearedQueue.setDonationQueue(donationQueueCommandToDonationQueue.convert(source.getDonationQueueCommand()));

        return clearedQueue;
    }
}
