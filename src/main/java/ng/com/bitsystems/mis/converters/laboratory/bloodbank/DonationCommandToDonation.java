package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.DonationCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Donations;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Storage;
import org.springframework.core.convert.converter.Converter;

public class DonationCommandToDonation implements Converter<DonationCommand, Donations> {
    private ClearedQueueCommandToClearedQueue clearedQueueCommandToClearedQueue;

    public DonationCommandToDonation(ClearedQueueCommandToClearedQueue clearedQueueCommandToClearedQueue) {
        this.clearedQueueCommandToClearedQueue = clearedQueueCommandToClearedQueue;
    }

    @Override
    public Donations convert(DonationCommand source) {

        if(source==null){
            return null;
        }
        final Donations donations=new Donations();
        donations.setId(source.getId());
        donations.setClearedQueue(clearedQueueCommandToClearedQueue.convert(source.getClearedQueueCommand()));
        donations.setTagId(source.getTagId());
        donations.setTimeOfDonation(source.getTimeOfDonation());

        if(source.getStorageId()!=null){
            Storage storage=new Storage();
            storage.setId(source.getStorageId());
            donations.setStorage(storage);
            Storage store = storage.addDonation(donations);
        }

        return donations;
    }
}
