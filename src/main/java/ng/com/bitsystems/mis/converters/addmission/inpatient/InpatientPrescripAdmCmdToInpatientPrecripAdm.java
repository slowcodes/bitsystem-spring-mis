package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionAdministrationCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionAdministration;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrescripAdmCmdToInpatientPrecripAdm implements Converter<InpatientPrescriptionAdministrationCommand, InpatientPrescriptionAdministration> {
    @Override
    public InpatientPrescriptionAdministration convert(InpatientPrescriptionAdministrationCommand source) {
        return null;
    }
}
