package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.BleedingScheduleCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.BleedingSchedule;
import org.springframework.core.convert.converter.Converter;

public class BleedingScheduleToBleedingScheduleCommand implements Converter<BleedingSchedule, BleedingScheduleCommand> {
    private DonationQueueToDonationQueueCommand donationQueueToDonationQueueCommand;
    private ClearedQueueToClearedQueueCommand clearedQueueToClearedQueueCommand;

    public BleedingScheduleToBleedingScheduleCommand(DonationQueueToDonationQueueCommand donationQueueToDonationQueueCommand,
                                                     ClearedQueueToClearedQueueCommand clearedQueueToClearedQueueCommand) {
        this.donationQueueToDonationQueueCommand = donationQueueToDonationQueueCommand;
        this.clearedQueueToClearedQueueCommand = clearedQueueToClearedQueueCommand;
    }

    @Override
    public BleedingScheduleCommand convert(BleedingSchedule source) {
        if(source==null){
            return null;
        }

        BleedingScheduleCommand bleedingScheduleCommand=new BleedingScheduleCommand();

        bleedingScheduleCommand.setId(source.getId());
        bleedingScheduleCommand.setDonationQueueCommand(donationQueueToDonationQueueCommand.convert(source.getDonationQueue()));
        bleedingScheduleCommand.setClearedQueueCommand(clearedQueueToClearedQueueCommand.convert(source.getClearedQueue()));
        bleedingScheduleCommand.setTimeOfSchedule(source.getTimeOfSchedule());

        if(source.getUsers()!=null)
            bleedingScheduleCommand.setUserId(source.getUsers().getId());

        return bleedingScheduleCommand;
    }
}
