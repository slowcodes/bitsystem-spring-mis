package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionScheduleCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionSchedule;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrecripScheduleToInpatientPrecripScheduleCmd implements Converter<InpatientPrescriptionSchedule, InpatientPrescriptionScheduleCommand> {
    @Override
    public InpatientPrescriptionScheduleCommand convert(InpatientPrescriptionSchedule source) {
        return null;
    }
}
