package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.SpecializationCommand;
import ng.com.bitsystems.mis.models.consultation.Specializations;
import org.springframework.core.convert.converter.Converter;

public class SpecializationToSpecializationCommand implements Converter<Specializations, SpecializationCommand> {
    @Override
    public SpecializationCommand convert(Specializations source) {
        if(source==null){
            return null;
        }

        final SpecializationCommand specializationCommand=new SpecializationCommand();
        specializationCommand.setId(source.getId());
        specializationCommand.setSpecialization(source.getSpecialization());
        return specializationCommand;
    }
}
