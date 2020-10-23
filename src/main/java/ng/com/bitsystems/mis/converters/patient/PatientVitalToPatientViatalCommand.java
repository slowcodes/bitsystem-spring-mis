package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientVitalsCommand;
import ng.com.bitsystems.mis.models.patients.PatientsVitals;
import org.springframework.core.convert.converter.Converter;

public class PatientVitalToPatientViatalCommand implements Converter<PatientsVitals, PatientVitalsCommand> {
    @Override
    public PatientVitalsCommand convert(PatientsVitals source) {
        return null;
    }
}
