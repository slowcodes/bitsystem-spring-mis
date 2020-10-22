package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.FacilityTypeCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.FacilityTypes;
import org.springframework.core.convert.converter.Converter;

public class FacilityTypeCommandToFacilityType implements Converter<FacilityTypeCommand, FacilityTypes> {
    @Override
    public FacilityTypes convert(FacilityTypeCommand source) {
        return null;
    }
}
