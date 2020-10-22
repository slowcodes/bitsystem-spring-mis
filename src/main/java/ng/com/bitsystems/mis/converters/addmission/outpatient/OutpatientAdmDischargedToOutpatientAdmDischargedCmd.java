package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientAdmissionDischargedCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmissionDischarged;
import org.springframework.core.convert.converter.Converter;

public class OutpatientAdmDischargedToOutpatientAdmDischargedCmd implements Converter<OutpatientAdmissionDischarged, OutpatientAdmissionDischargedCommand> {
    @Override
    public OutpatientAdmissionDischargedCommand convert(OutpatientAdmissionDischarged source) {
        return null;
    }
}
