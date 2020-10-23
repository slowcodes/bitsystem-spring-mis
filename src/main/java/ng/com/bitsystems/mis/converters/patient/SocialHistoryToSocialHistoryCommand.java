package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientSocialHistoryCommand;
import ng.com.bitsystems.mis.models.patients.PatientsSocialHistory;
import org.springframework.core.convert.converter.Converter;

public class SocialHistoryToSocialHistoryCommand implements Converter<PatientsSocialHistory, PatientSocialHistoryCommand> {
    @Override
    public PatientSocialHistoryCommand convert(PatientsSocialHistory source) {
        return null;
    }
}
