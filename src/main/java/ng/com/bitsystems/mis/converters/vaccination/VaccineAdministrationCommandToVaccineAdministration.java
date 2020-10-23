package ng.com.bitsystems.mis.converters.vaccination;

import ng.com.bitsystems.mis.command.vaccination.VaccineAdministrationCommand;
import ng.com.bitsystems.mis.models.vaccination.VaccineAdministration;
import org.springframework.core.convert.converter.Converter;

public class VaccineAdministrationCommandToVaccineAdministration implements Converter<VaccineAdministrationCommand, VaccineAdministration> {
    @Override
    public VaccineAdministration convert(VaccineAdministrationCommand source) {
        return null;
    }
}
