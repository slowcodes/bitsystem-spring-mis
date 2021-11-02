package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.DonationQueueCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonationQueue;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonorRegistry;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DonationQueueCommandToDonationQueue
implements Converter<DonationQueueCommand, DonationQueue> {
    @Override
    public DonationQueue convert(DonationQueueCommand source) {
        if(source==null){
            return null;
        }
        final DonationQueue donationQueue =new DonationQueue();
        donationQueue.setId(source.getId());

        if(source.getUserId()!=null){
            AppUsers scientists=new AppUsers();
            scientists.setId(source.getUserId());
            //donationQueue.setAppUsers(scientists);
            AppUsers sct = scientists.addDonationQueue(donationQueue);
        }

        donationQueue.setCompensation(source.getCompensation());
        donationQueue.setStatus(source.getStatus());

        if(source.getDonorRegistryId()!=null){
            DonorRegistry donorRegistry=new DonorRegistry();
            donorRegistry.setId(source.getDonorRegistryId());
            donationQueue.setDonorRegistry(donorRegistry);
            //DonorRegistry registry = donorRegistry.addDonationQueue(donationQueue);
        }

        return donationQueue;
    }
}
