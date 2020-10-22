package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptions;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrescripCmdToInpatientPrescrip implements Converter<InpatientPrescriptionCommand, InpatientPrescriptions> {
    @Override
    public InpatientPrescriptions convert(InpatientPrescriptionCommand source) {
        return null;
    }
}
