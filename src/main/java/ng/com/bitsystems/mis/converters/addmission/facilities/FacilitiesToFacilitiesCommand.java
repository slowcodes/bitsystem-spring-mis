package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.FacilitiesCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.Facilities;
import org.springframework.core.convert.converter.Converter;

public class FacilitiesToFacilitiesCommand implements Converter<Facilities, FacilitiesCommand> {
    @Override
    public FacilitiesCommand convert(Facilities source) {
        return null;
    }
}
