package ng.com.bitsystems.mis.converters.pharmacy;

import ng.com.bitsystems.mis.command.pharmacy.GeneratedAdministrationCommand;
import ng.com.bitsystems.mis.models.pharmacy.GeneratedAdministration;
import org.springframework.core.convert.converter.Converter;

public class GeneratedAdministrationCommandToGeneratedAdministration
implements Converter<GeneratedAdministrationCommand, GeneratedAdministration> {
    @Override
    public GeneratedAdministration convert(GeneratedAdministrationCommand source) {
        return null;
    }
}
