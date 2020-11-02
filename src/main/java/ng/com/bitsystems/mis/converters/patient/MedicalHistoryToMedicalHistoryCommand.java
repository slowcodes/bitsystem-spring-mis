package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientMedicalHistoryCommand;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalHistory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class MedicalHistoryToMedicalHistoryCommand implements
        Converter<PatientsMedicalHistory, PatientMedicalHistoryCommand> {
    private ActivityListingToActivityListingCommand activityListingToActivityListingCommand;

    public MedicalHistoryToMedicalHistoryCommand(ActivityListingToActivityListingCommand activityListingToActivityListingCommand) {
        this.activityListingToActivityListingCommand = activityListingToActivityListingCommand;
    }

    @Nullable
    @Override
    public PatientMedicalHistoryCommand convert(PatientsMedicalHistory source) {
        if(source==null)
            return null;


        final PatientMedicalHistoryCommand patientMedicalHistoryCommand=new PatientMedicalHistoryCommand();
        patientMedicalHistoryCommand.setId(source.getId());
        patientMedicalHistoryCommand.setDateRecorded(source.getDateRecorded());
        patientMedicalHistoryCommand.setPatientMedicalActivityListingCommand(activityListingToActivityListingCommand.convert(source.getPatientsMedicalActivityListing()));

        if(source.getUsers()!=null)
            patientMedicalHistoryCommand.setUserId(source.getUsers().getId());

        if(source.getPatients()!=null)
            patientMedicalHistoryCommand.setPatientId(source.getPatients().getId());

        return patientMedicalHistoryCommand;
    }
}
