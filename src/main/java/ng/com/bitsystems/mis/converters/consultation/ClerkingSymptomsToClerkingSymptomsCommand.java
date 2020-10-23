package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.ClerkingSymptomsCommand;
import ng.com.bitsystems.mis.models.consultation.ClerkingSymptoms;
import org.springframework.core.convert.converter.Converter;

public class ClerkingSymptomsToClerkingSymptomsCommand implements Converter<ClerkingSymptoms, ClerkingSymptomsCommand> {
    @Override
    public ClerkingSymptomsCommand convert(ClerkingSymptoms source) {
        return null;
    }
}
