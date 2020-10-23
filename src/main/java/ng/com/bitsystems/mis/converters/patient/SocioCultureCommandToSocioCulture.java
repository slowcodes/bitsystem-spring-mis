package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientSocialHistoryCommand;
import ng.com.bitsystems.mis.command.patients.SocioCulturalCommand;
import org.springframework.core.convert.converter.Converter;

public class SocioCultureCommandToSocioCulture
implements Converter<SocioCulturalCommand, PatientSocialHistoryCommand> {
    @Override
    public PatientSocialHistoryCommand convert(SocioCulturalCommand source) {
        return null;
    }
}
