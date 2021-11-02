package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientMedicalHistoryCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalHistory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class MedicalHistoryCommandToMedicalHistory implements Converter<PatientMedicalHistoryCommand, PatientsMedicalHistory> {

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


        return patientsMedicalHistory;
    }
}
