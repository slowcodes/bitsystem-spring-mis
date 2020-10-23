package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import org.springframework.core.convert.converter.Converter;

public class PatientCommandToPatient implements Converter<PatientCommand, Patients> {
    @Override
    public Patients convert(PatientCommand source) {
        return null;
    }
}
