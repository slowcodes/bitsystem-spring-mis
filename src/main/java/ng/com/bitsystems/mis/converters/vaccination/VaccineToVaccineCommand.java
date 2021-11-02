package ng.com.bitsystems.mis.converters.vaccination;

import ng.com.bitsystems.mis.command.vaccination.VaccineCommand;
import ng.com.bitsystems.mis.models.vaccination.Vaccines;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class VaccineToVaccineCommand implements Converter<Vaccines, VaccineCommand> {
    @Override
    public VaccineCommand convert(Vaccines source) {
        return null;
    }
}
