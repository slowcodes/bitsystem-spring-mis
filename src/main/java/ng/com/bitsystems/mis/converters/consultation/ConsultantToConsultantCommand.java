package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.ConsultantCommands;
import ng.com.bitsystems.mis.models.users.Consultants;
import org.springframework.core.convert.converter.Converter;

public class ConsultantToConsultantCommand implements Converter<Consultants, ConsultantCommands> {
    @Override
    public ConsultantCommands convert(Consultants source) {
        return null;
    }
}
