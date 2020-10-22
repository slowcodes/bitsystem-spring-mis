package ng.com.bitsystems.mis.converters.addmission.inpatient;

import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientPrescriptionGeneratedAdministrationCommand;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientPrescriptionGeneratedAdministration;
import org.springframework.core.convert.converter.Converter;

public class InpatientPrescriptGenAdmCmdToInpatientPrescripGenAdm implements Converter<InpatientPrescriptionGeneratedAdministrationCommand, InpatientPrescriptionGeneratedAdministration> {
    @Override
    public InpatientPrescriptionGeneratedAdministration convert(InpatientPrescriptionGeneratedAdministrationCommand source) {
        return null;
    }
}
