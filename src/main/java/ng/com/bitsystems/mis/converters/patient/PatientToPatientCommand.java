package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import org.springframework.core.convert.converter.Converter;

public class PatientToPatientCommand implements Converter<Patients, PatientCommand> {
    @Override
    public PatientCommand convert(Patients source) {
        return null;
    }
}
