package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.BleedingScheduleCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.BleedingSchedule;
import ng.com.bitsystems.mis.models.users.Receptionists;
import org.springframework.core.convert.converter.Converter;

public class BleedingScheduleCommandToBleedingSchedule
        implements Converter<BleedingScheduleCommand, BleedingSchedule> {
    private DonationQueueCommandToDonationQueue donationQueueCommandToDonationQueue;
    private ClearedQueueCommandToClearedQueue clearedQueueCommandToClearedQueue;

    @Override
    public BleedingSchedule convert(BleedingScheduleCommand source) {


        if(source==null){
            return null;
        }

        final BleedingSchedule bleedingSchedule=new BleedingSchedule();
        bleedingSchedule.setId(source.getId());
        bleedingSchedule.setDonationQueue(source.getDonationQueue());
        bleedingSchedule.setClearedQueue(clearedQueueCommandToClearedQueue.convert(source.getClearedQueueCommand()));
        bleedingSchedule.setTimeOfSchedule(source.getTimeOfSchedule());
        if(source.getUserId()!=null){
            Receptionists receptionists = new Receptionists();
            receptionists.setId(source.getId());
            bleedingSchedule.setUsers(receptionists);
            Receptionists recp = receptionists.addBleedingSchedule(bleedingSchedule);
        }
        return bleedingSchedule;
    }
}
