package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmissionDischarged;
import org.springframework.core.convert.converter.Converter;

public class OutpatientAdmDischargedCmdToOutpatientAdmDischarged
implements Converter<OutpatientAdmissionDischarged, OutpatientAdmissionDischarged> {
    @Override
    public OutpatientAdmissionDischarged convert(OutpatientAdmissionDischarged source) {
        return null;
    }
}
