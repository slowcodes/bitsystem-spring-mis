package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientDischargeCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientDischarged;
import org.springframework.core.convert.converter.Converter;

public class InpatientDischagedCmdToInpatientDischarged implements Converter<InpatientDischargeCommand, InpatientDischarged> {
    @Override
    public InpatientDischarged convert(InpatientDischargeCommand source) {
        return null;
    }
}
