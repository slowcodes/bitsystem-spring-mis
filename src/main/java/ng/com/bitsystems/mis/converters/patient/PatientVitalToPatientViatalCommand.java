package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientVitalsCommand;
import ng.com.bitsystems.mis.models.patients.PatientsVitals;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PatientVitalToPatientViatalCommand implements Converter<PatientsVitals, PatientVitalsCommand> {
    @Override
    public PatientVitalsCommand convert(PatientsVitals source) {
        if(source==null)
            return null;

        final PatientVitalsCommand patientVitalsCommand=new PatientVitalsCommand();
        patientVitalsCommand.setBloodPresure(source.getBloodPresure());
        patientVitalsCommand.setBloodSugar(source.getBloodSugar());
        patientVitalsCommand.setHeight(source.getHeight());
        patientVitalsCommand.setId(source.getId());
        patientVitalsCommand.setLocalDateTime(source.getLocalDateTime());
        if(source.getPatients()!=null)
            patientVitalsCommand.setPatientId(source.getPatients().getId());
        patientVitalsCommand.setPulseRate(source.getPulseRate());
        patientVitalsCommand.setTempreture(source.getTempreture());
        patientVitalsCommand.setWeight(source.getWeight());

        return patientVitalsCommand;
    }
}
