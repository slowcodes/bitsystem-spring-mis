package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.FacilityTypeCategoryCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.FacilityTypeCategory;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FacilityTypeCategoryCommandToFacilityTypeCategory implements
        Converter<FacilityTypeCategoryCommand, FacilityTypeCategory> {

    private FacilitiesCommandToFacilities facilitiesCommandToFacilities;

    public FacilityTypeCategoryCommandToFacilityTypeCategory(FacilitiesCommandToFacilities facilitiesCommandToFacilities) {
        this.facilitiesCommandToFacilities = facilitiesCommandToFacilities;
    }

    @Override
    public FacilityTypeCategory convert(FacilityTypeCategoryCommand source) {
        if(source==null){
            return null;
        }

        FacilityTypeCategory facilityTypeCategory = new FacilityTypeCategory();
        facilityTypeCategory.setId(source.getId());
        facilityTypeCategory.setCategory(source.getCategory());
        if (source.getFacilitiesCommands()!=null && source.getFacilitiesCommands().size()>0)
            source.getFacilitiesCommands().forEach(facilitiesCommand->facilityTypeCategory.getFacilities().add(facilitiesCommandToFacilities.convert(facilitiesCommand)));

        return facilityTypeCategory;
    }
}
