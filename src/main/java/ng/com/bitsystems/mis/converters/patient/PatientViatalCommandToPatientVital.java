package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientVitalsCommand;
import ng.com.bitsystems.mis.models.patients.PatientsVitals;
import org.springframework.core.convert.converter.Converter;

public class PatientViatalCommandToPatientVital implements Converter<PatientVitalsCommand, PatientsVitals> {
    @Override
    public PatientsVitals convert(PatientVitalsCommand source) {
        return null;
    }
}
