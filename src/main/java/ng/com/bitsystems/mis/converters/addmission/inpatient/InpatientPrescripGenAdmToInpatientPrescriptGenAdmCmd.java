package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionGeneratedAdministrationCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionGeneratedAdministration;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrescripGenAdmToInpatientPrescriptGenAdmCmd implements Converter<InpatientPrescriptionGeneratedAdministration, InpatientPrescriptionGeneratedAdministrationCommand> {
    @Override
    public InpatientPrescriptionGeneratedAdministrationCommand convert(InpatientPrescriptionGeneratedAdministration source) {
        return null;
    }
}
