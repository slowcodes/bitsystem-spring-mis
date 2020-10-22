package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientPrecriptionScheduleCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptionSchedule;
import org.springframework.core.convert.converter.Converter;

public class OutpatientPrescripScheduleCmdToOutpatientPrescripSchedule
implements Converter<OutpatientPrecriptionScheduleCommand, OutpatientPrescriptionSchedule> {
    @Override
    public OutpatientPrescriptionSchedule convert(OutpatientPrecriptionScheduleCommand source) {
        return null;
    }
}
