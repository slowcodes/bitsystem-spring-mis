package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptions;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrescripToInpatientPrescripCmd
implements Converter<InpatientPrescriptions, InpatientPrescriptionCommand> {
    @Override
    public InpatientPrescriptionCommand convert(InpatientPrescriptions source) {
        return null;
    }
}
