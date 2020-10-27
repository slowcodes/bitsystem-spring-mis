package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.FacilityTypeCategoryCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.FacilityTypeCategory;
import org.springframework.core.convert.converter.Converter;

public class FacilityTypeCategoryToFacilityTypeCategoryCommand implements Converter<FacilityTypeCategory, FacilityTypeCategoryCommand> {

    private FacilitiesToFacilitiesCommand facilitiesToFacilitiesCommand;

    public FacilityTypeCategoryToFacilityTypeCategoryCommand(FacilitiesToFacilitiesCommand facilitiesToFacilitiesCommand) {
        this.facilitiesToFacilitiesCommand = facilitiesToFacilitiesCommand;
    }

    @Override
    public FacilityTypeCategoryCommand convert(FacilityTypeCategory source) {

        if(source==null){
            return null;
        }
        FacilityTypeCategoryCommand facilityTypeCategoryCommand=new FacilityTypeCategoryCommand();
        facilityTypeCategoryCommand.setCategory(source.getCategory());
        facilityTypeCategoryCommand.setId(source.getId());
        if(source.getFacilities()!=null && source.getFacilities().size()>0)
            source.getFacilities().forEach(facilities -> facilityTypeCategoryCommand.getFacilitiesCommands().add(facilitiesToFacilitiesCommand.convert(facilities)));

        return facilityTypeCategoryCommand;
    }
}
