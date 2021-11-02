package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientVitalsCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.patients.PatientsVitals;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PatientVitalCommandToPatientVital implements Converter<PatientVitalsCommand, PatientsVitals> {
    @Override
    public PatientsVitals convert(PatientVitalsCommand source) {
        
        
        if(source==null)
            return null;
        
        final PatientsVitals patientsVitals=new PatientsVitals();
        patientsVitals.setBloodPresure(source.getBloodPresure());
        patientsVitals.setBloodSugar(source.getBloodSugar());
        patientsVitals.setHeight(source.getHeight());
        patientsVitals.setLocalDateTime(source.getLocalDateTime());
        patientsVitals.setPulseRate(source.getPulseRate());
        patientsVitals.setTempreture(source.getTempreture());
        patientsVitals.setWeight(source.getWeight());
        patientsVitals.setId(source.getId());
        if(source.getPatientId()!=null){
            Patients patients=new Patients();
            patients.setId(source.getPatientId());
            patientsVitals.setPatients(patients);
            Patients patient = patients.addVitals(patientsVitals);
        }
        return patientsVitals;
    }
}
