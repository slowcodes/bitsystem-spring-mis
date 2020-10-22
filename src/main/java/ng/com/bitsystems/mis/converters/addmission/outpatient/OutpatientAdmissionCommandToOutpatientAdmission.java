package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientAdmissionCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmission;
import org.springframework.core.convert.converter.Converter;

public class OutpatientAdmissionCommandToOutpatientAdmission
implements Converter<OutpatientAdmissionCommand, OutpatientAdmission> {
    @Override
    public OutpatientAdmission convert(OutpatientAdmissionCommand source) {
        return null;
    }
}
