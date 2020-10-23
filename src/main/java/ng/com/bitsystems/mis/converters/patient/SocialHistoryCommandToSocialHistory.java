package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientSocialHistoryCommand;
import ng.com.bitsystems.mis.models.patients.PatientsSocialHistory;
import org.springframework.core.convert.converter.Converter;

public class SocialHistoryCommandToSocialHistory implements
        Converter<PatientSocialHistoryCommand, PatientsSocialHistory> {
    @Override
    public PatientsSocialHistory convert(PatientSocialHistoryCommand source) {
        return null;
    }
}
