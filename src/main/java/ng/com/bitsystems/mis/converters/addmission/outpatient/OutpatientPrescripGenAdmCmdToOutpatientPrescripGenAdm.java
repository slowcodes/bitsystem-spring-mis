package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientPrecriptionGeneratedAdminCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptionGeneratedAdministration;
import org.springframework.core.convert.converter.Converter;

public class OutpatientPrescripGenAdmCmdToOutpatientPrescripGenAdm
implements Converter<OutpatientPrecriptionGeneratedAdminCommand, OutpatientPrescriptionGeneratedAdministration> {
    @Override
    public OutpatientPrescriptionGeneratedAdministration convert(OutpatientPrecriptionGeneratedAdminCommand source) {
        return null;
    }
}
