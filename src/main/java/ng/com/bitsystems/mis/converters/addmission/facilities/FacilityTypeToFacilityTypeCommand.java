package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.FacilityTypeCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.FacilityTypes;
import org.springframework.core.convert.converter.Converter;

public class FacilityTypeToFacilityTypeCommand implements Converter<FacilityTypes, FacilityTypeCommand> {
    @Override
    public FacilityTypeCommand convert(FacilityTypes source) {
        return null;
    }
}
