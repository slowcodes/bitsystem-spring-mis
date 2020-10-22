package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientAdmissionCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmission;
import org.springframework.core.convert.converter.Converter;

public class OutpatientAdmissionToOutpatientAdmissionCommand implements Converter<OutpatientAdmission, OutpatientAdmissionCommand> {
    @Override
    public OutpatientAdmissionCommand convert(OutpatientAdmission source) {
        return null;
    }
}
