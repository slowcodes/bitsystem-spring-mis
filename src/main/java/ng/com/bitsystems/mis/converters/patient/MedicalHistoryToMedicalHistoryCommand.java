package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientMedicalHistoryCommand;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalHistory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class MedicalHistoryToMedicalHistoryCommand implements
        Converter<PatientsMedicalHistory, PatientMedicalHistoryCommand> {

    public MedicalHistoryToMedicalHistoryCommand() {
    }

    @Nullable
    @Override
    public PatientMedicalHistoryCommand convert(PatientsMedicalHistory source) {
        if(source==null)
            return null;


        final PatientMedicalHistoryCommand patientMedicalHistoryCommand=new PatientMedicalHistoryCommand();
        patientMedicalHistoryCommand.setId(source.getId());
        patientMedicalHistoryCommand.setDateRecorded(source.getDateRecorded());

        if(source.getPatients()!=null)
            patientMedicalHistoryCommand.setPatientId(source.getPatients().getId());

        return patientMedicalHistoryCommand;
    }
}
