package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.ClerkingSymptomsCommand;
import ng.com.bitsystems.mis.models.consultation.ClerkingSymptoms;
import org.springframework.core.convert.converter.Converter;

public class ClerkingSymptomsCommandToClerkingSymptoms implements Converter<ClerkingSymptomsCommand, ClerkingSymptoms> {
    @Override
    public ClerkingSymptoms convert(ClerkingSymptomsCommand source) {
        return null;
    }
}
