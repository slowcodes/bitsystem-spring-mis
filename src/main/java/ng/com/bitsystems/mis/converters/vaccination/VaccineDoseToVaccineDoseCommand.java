package ng.com.bitsystems.mis.converters.vaccination;

import ng.com.bitsystems.mis.command.vaccination.VaccineDoseCommand;
import ng.com.bitsystems.mis.models.vaccination.VaccineDoses;
import org.springframework.core.convert.converter.Converter;

public class VaccineDoseToVaccineDoseCommand implements Converter<VaccineDoses, VaccineDoseCommand> {
    @Override
    public VaccineDoseCommand convert(VaccineDoses source) {
        return null;
    }
}
