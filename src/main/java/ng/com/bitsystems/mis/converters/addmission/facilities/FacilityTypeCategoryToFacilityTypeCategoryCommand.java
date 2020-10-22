package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.FacilityTypeCategoryCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.FacilityTypeCategory;
import org.springframework.core.convert.converter.Converter;

public class FacilityTypeCategoryToFacilityTypeCategoryCommand implements Converter<FacilityTypeCategory, FacilityTypeCategoryCommand> {
    @Override
    public FacilityTypeCategoryCommand convert(FacilityTypeCategory source) {
        return null;
    }
}
