package ng.com.bitsystems.mis.converters.vaccination;

import ng.com.bitsystems.mis.command.vaccination.VaccineDoseCommand;
import ng.com.bitsystems.mis.models.vaccination.VaccineDoses;
import org.springframework.core.convert.converter.Converter;

public class VaccineDoseCommandToVaccineDose implements Converter<VaccineDoseCommand, VaccineDoses> {
    @Override
    public VaccineDoses convert(VaccineDoseCommand source) {
        return null;
    }
}
