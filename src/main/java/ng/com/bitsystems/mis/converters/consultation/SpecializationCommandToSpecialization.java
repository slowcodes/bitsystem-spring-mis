package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.SpecializationCommand;
import ng.com.bitsystems.mis.models.consultation.Specializations;
import org.springframework.core.convert.converter.Converter;

public class SpecializationCommandToSpecialization implements Converter<SpecializationCommand, Specializations> {
    @Override
    public Specializations convert(SpecializationCommand source) {
        if(source==null){
            return null;
        }
        final Specializations specializations=new Specializations();
        specializations.setId(source.getId());
        specializations.setSpecialization(source.getSpecialization());

        return specializations;
    }
}
