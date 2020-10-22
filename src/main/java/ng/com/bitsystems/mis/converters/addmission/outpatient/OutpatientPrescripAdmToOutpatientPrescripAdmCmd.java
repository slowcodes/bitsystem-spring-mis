package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientPrescriptionAdministrationCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptionAdministration;
import org.springframework.core.convert.converter.Converter;

public class OutpatientPrescripAdmToOutpatientPrescripAdmCmd
implements Converter<OutpatientPrescriptionAdministration, OutpatientPrescriptionAdministrationCommand> {
    @Override
    public OutpatientPrescriptionAdministrationCommand convert(OutpatientPrescriptionAdministration source) {
        return null;
    }
}
