package ng.com.bitsystems.mis.converters.consultation;

import ng.com.bitsystems.mis.command.consultation.ConsultantCommands;
import ng.com.bitsystems.mis.models.users.Consultants;
import org.springframework.core.convert.converter.Converter;

public class ConsultantCommandToConsultant implements Converter<ConsultantCommands, Consultants> {
    @Override
    public Consultants convert(ConsultantCommands source) {
        return null;
    }
}
