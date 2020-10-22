package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientPrescriptionCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptions;
import org.springframework.core.convert.converter.Converter;

public class OutpatientPrescriptionToOutpatientPrecriptionCommand implements
        Converter<OutpatientPrescriptions, OutpatientPrescriptionCommand> {
    @Override
    public OutpatientPrescriptionCommand convert(OutpatientPrescriptions source) {
        return null;
    }
}
