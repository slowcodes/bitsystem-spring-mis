package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientMedicalHistoryCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalHistory;
import ng.com.bitsystems.mis.models.users.Physicians;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class MedicalHistoryCommandToMedicalHistory implements Converter<PatientMedicalHistoryCommand, PatientsMedicalHistory> {
    private ActivityListingCommandToActivityListing activityListingCommandToActivityListing;

    @Nullable
    @Override
    public PatientsMedicalHistory convert(PatientMedicalHistoryCommand source) {

        if(source==null)
            return null;

        PatientsMedicalHistory patientsMedicalHistory=new PatientsMedicalHistory();
        patientsMedicalHistory.setId(source.getId());
        patientsMedicalHistory.setDateRecorded(source.getDateRecorded());

        if(source.getPatientId()!=null){
            Patients patients=new Patients();
            patients.setId(source.getPatientId());
            patientsMedicalHistory.setPatients(patients);
            Patients patient = patients.addMedicalHistory(patientsMedicalHistory);
        }

        patientsMedicalHistory.setPatientsMedicalActivityListing(activityListingCommandToActivityListing.convert(source.getPatientMedicalActivityListingCommand()));

        if(source.getUserId()!=null){
            Physicians physicians=new Physicians();
            physicians.setId(source.getUserId());
            patientsMedicalHistory.setUsers(physicians);
            Physicians doctor = physicians.addMedicalHistory(patientsMedicalHistory);
        }

        return patientsMedicalHistory;
    }
}
