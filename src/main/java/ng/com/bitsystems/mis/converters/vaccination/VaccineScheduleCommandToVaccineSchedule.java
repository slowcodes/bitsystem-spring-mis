package ng.com.bitsystems.mis.converters.vaccination;

import ng.com.bitsystems.mis.command.vaccination.VaccineScheduleCommand;
import ng.com.bitsystems.mis.models.vaccination.VaccineSchedule;
import org.springframework.core.convert.converter.Converter;

public class VaccineScheduleCommandToVaccineSchedule implements Converter<VaccineScheduleCommand, VaccineSchedule> {
    @Override
    public VaccineSchedule convert(VaccineScheduleCommand source) {
        return null;
    }
}
