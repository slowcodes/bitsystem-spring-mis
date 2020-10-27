package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.converters.addmission.facilities.StartUsageCommandToStartUsage;
import ng.com.bitsystems.mis.converters.addmission.inpatient.InpatientPrescripCmdToInpatientPrescrip;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmissionDischarged;
import org.springframework.core.convert.converter.Converter;

public class OutpatientAdmDischargedCmdToOutpatientAdmDischarged
implements Converter<OutpatientAdmissionDischarged, OutpatientAdmissionDischarged> {
    private InpatientPrescripCmdToInpatientPrescrip inpatientPrescripCmdToInpatientPrescrip;
    private StartUsageCommandToStartUsage startUsageCommandToStartUsage;

    @Override
    public OutpatientAdmissionDischarged convert(OutpatientAdmissionDischarged source) {
        return null;
    }
}
