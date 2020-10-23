package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.GeneratedAdministrationCommand;
import ng.com.bitsystems.mis.models.pharmacy.GeneratedAdministration;
import org.springframework.core.convert.converter.Converter;

public class GeneratedAdministrationToGeneratedAdministrationCommand
implements Converter<GeneratedAdministration, GeneratedAdministrationCommand> {
    @Override
    public GeneratedAdministrationCommand convert(GeneratedAdministration source) {
        return null;
    }
}
