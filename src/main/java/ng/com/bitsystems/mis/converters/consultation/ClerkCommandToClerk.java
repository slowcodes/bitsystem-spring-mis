package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.ClerksCommand;
import ng.com.bitsystems.mis.models.consultation.Clerks;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ClerkCommandToClerk implements Converter<ClerksCommand, Clerks> {
    @Override
    public Clerks convert(ClerksCommand source) {
        return null;
    }
}
