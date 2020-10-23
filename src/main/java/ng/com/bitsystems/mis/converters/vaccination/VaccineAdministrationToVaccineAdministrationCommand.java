package ng.com.bitsystems.mis.converters.vaccination;

import ng.com.bitsystems.mis.command.vaccination.VaccineAdministrationCommand;
import ng.com.bitsystems.mis.models.vaccination.VaccineAdministration;
import org.springframework.core.convert.converter.Converter;

public class VaccineAdministrationToVaccineAdministrationCommand implements Converter<VaccineAdministration, VaccineAdministrationCommand> {
    @Override
    public VaccineAdministrationCommand convert(VaccineAdministration source) {
        return null;
    }
}
