package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.FacilityTypeCategoryCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.FacilityTypeCategory;
import org.springframework.core.convert.converter.Converter;

public class FacilityTypeCategoryCommandToFacilityTypeCategory implements Converter<FacilityTypeCategoryCommand, FacilityTypeCategory> {
    @Override
    public FacilityTypeCategory convert(FacilityTypeCategoryCommand source) {
        return null;
    }
}
