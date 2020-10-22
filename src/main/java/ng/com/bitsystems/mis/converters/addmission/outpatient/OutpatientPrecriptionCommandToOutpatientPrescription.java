package ng.com.bitsystems.mis.converters.addmission.outpatient;

import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientPrescriptionCommand;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptions;
import org.springframework.core.convert.converter.Converter;

public class OutpatientPrecriptionCommandToOutpatientPrescription
implements Converter<OutpatientPrescriptionCommand, OutpatientPrescriptions> {
    @Override
    public OutpatientPrescriptions convert(OutpatientPrescriptionCommand source) {
        return null;
    }
}
