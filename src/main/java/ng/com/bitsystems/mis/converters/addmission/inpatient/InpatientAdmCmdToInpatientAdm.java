package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientAdmissionCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientAdmission;
import org.springframework.core.convert.converter.Converter;

public class InpatientAdmCmdToInpatientAdm implements Converter<InpatientAdmissionCommand, InpatientAdmission> {
    @Override
    public InpatientAdmission convert(InpatientAdmissionCommand source) {
        return null;
    }
}
