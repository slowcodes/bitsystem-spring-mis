package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.SpecializationCommand;
import ng.com.bitsystems.mis.models.consultation.Specializations;
import org.springframework.core.convert.converter.Converter;

public class SpecializationToSpecializationCommand implements Converter<Specializations, SpecializationCommand> {
    @Override
    public SpecializationCommand convert(Specializations source) {
        return null;
    }
}
