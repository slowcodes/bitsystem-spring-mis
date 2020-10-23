package ng.com.bitsystems.mis.converters.laboratory.bloodbank;

import ng.com.bitsystems.mis.command.laboratories.bloodbank.BleedingScheduleCommand;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.BleedingSchedule;
import org.springframework.core.convert.converter.Converter;

public class BleedingScheduleToBleedingScheduleCommand implements Converter<BleedingSchedule, BleedingScheduleCommand> {
    @Override
    public BleedingScheduleCommand convert(BleedingSchedule source) {
        return null;
    }
}
