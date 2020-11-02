package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientSocialHistoryCommand;
import ng.com.bitsystems.mis.models.patients.PatientsSocialHistory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class SocialHistoryToSocialHistoryCommand implements Converter<PatientsSocialHistory, PatientSocialHistoryCommand> {

    private SocioCultureToSocioCultureCommand socioCultureToSocioCultureCommand;

    public SocialHistoryToSocialHistoryCommand(SocioCultureToSocioCultureCommand socioCultureToSocioCultureCommand) {
        this.socioCultureToSocioCultureCommand = socioCultureToSocioCultureCommand;
    }

    @Nullable
    @Override
    public PatientSocialHistoryCommand convert(PatientsSocialHistory source) {
        if(source==null)
            return null;

        final PatientSocialHistoryCommand patientSocialHistoryCommand=new PatientSocialHistoryCommand();
        patientSocialHistoryCommand.setId(source.getId());
        patientSocialHistoryCommand.setDateRecorded(source.getDateRecorded());
        patientSocialHistoryCommand.setSocioCulturalCommand(socioCultureToSocioCultureCommand.convert(source.getPatientSocioHistory()));

        if(source.getUsers()!=null)
            patientSocialHistoryCommand.setUserId(source.getUsers().getId());

        if(source.getPatients()!=null)
            patientSocialHistoryCommand.setPatientId(source.getUsers().getId());

        return patientSocialHistoryCommand;
    }
}
