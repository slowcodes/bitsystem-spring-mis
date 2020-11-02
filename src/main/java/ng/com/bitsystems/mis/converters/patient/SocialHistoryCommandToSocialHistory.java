package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientSocialHistoryCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.patients.PatientsSocialHistory;
import ng.com.bitsystems.mis.models.users.Physicians;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class SocialHistoryCommandToSocialHistory implements
        Converter<PatientSocialHistoryCommand, PatientsSocialHistory> {
    private SocioCultureCommandToSocioCulture socioCultureCommandToSocioCulture;

    @Nullable
    @Override
    public PatientsSocialHistory convert(PatientSocialHistoryCommand source) {
        if(source==null)
            return null;

        final PatientsSocialHistory patientsSocialHistory=new PatientsSocialHistory();
        patientsSocialHistory.setDateRecorded(source.getDateRecorded());
        if(source.getPatientId()!=null){
            Patients patients=new Patients();
            patients.setId(source.getPatientId());
            patientsSocialHistory.setPatients(patients);
            Patients patient = patients.addSocialHistory(patientsSocialHistory);
        }

        patientsSocialHistory.setPatientSocioHistory(socioCultureCommandToSocioCulture.convert(source.getSocioCulturalCommand()));

        if(source.getUserId()!=null){
            Physicians physicians = new Physicians();
            physicians.setId(source.getUserId());
            patientsSocialHistory.setUsers(physicians);
            Physicians physician = physicians.addPatientSocialHistory(patientsSocialHistory);
        }

        return patientsSocialHistory;
    }
}
