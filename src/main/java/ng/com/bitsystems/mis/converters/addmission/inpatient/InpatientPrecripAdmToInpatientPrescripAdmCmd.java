package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionAdministration;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrecripAdmToInpatientPrescripAdmCmd implements Converter<InpatientPrescriptionAdministration, InpatientPrescriptionAdministration> {
    @Override
    public InpatientPrescriptionAdministration convert(InpatientPrescriptionAdministration source) {
        return null;
    }
}
