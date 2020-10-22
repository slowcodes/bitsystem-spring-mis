package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientPrecriptionGeneratedAdminCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptionGeneratedAdministration;
import org.springframework.core.convert.converter.Converter;

public class OutpatientPrescripGenAdmToOutpatientPrescripGenAdmToCmd implements Converter<OutpatientPrescriptionGeneratedAdministration, OutpatientPrecriptionGeneratedAdminCommand> {
    @Override
    public OutpatientPrecriptionGeneratedAdminCommand convert(OutpatientPrescriptionGeneratedAdministration source) {
        return null;
    }
}
