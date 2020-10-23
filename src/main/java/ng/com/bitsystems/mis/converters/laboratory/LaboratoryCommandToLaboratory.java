package ng.com.bitsystems.mis.converters.laboratory;

import ng.com.bitsystems.mis.command.laboratories.LaboratoriesCommand;
import ng.com.bitsystems.mis.models.laboratories.Laboratories;
import org.springframework.core.convert.converter.Converter;

public class LaboratoryCommandToLaboratory implements Converter<LaboratoriesCommand, Laboratories> {
    @Override
    public Laboratories convert(LaboratoriesCommand source) {
        return null;
    }
}
