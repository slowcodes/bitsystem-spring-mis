package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientPrecriptionScheduleCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptionSchedule;
import org.springframework.core.convert.converter.Converter;

public class OutpatientPrescripScheduleToOutpatientPrescripScheduleCmd implements Converter<OutpatientPrescriptionSchedule, OutpatientPrecriptionScheduleCommand> {
    @Override
    public OutpatientPrecriptionScheduleCommand convert(OutpatientPrescriptionSchedule source) {
        return null;
    }
}
