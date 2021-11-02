package ng.com.bitsystems.mis.converters.vaccination;

import ng.com.bitsystems.mis.command.vaccination.VaccineCommand;
import ng.com.bitsystems.mis.models.vaccination.Vaccines;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class VaccineCommandToVaccine implements Converter<VaccineCommand, Vaccines> {
    @Override
    public Vaccines convert(VaccineCommand source) {
        return null;
    }
}
