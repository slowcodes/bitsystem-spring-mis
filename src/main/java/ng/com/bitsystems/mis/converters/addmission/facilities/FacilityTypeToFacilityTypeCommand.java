package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.FacilityTypeCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.FacilityTypes;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FacilityTypeToFacilityTypeCommand implements Converter<FacilityTypes, FacilityTypeCommand> {
    FacilitiesToFacilitiesCommand facilitiesToFacilitiesCommand;

    public FacilityTypeToFacilityTypeCommand(FacilitiesToFacilitiesCommand facilitiesToFacilitiesCommand) {
        this.facilitiesToFacilitiesCommand = facilitiesToFacilitiesCommand;
    }

    @Override
    public FacilityTypeCommand convert(FacilityTypes source) {
        if(source==null){
            return null;
        }
        FacilityTypeCommand facilityTypeCommand = new FacilityTypeCommand();
        facilityTypeCommand.setId(source.getId());
        if(source.getFacilities() !=null && source.getFacilities().size()>0)
            source.getFacilities().forEach(facilities -> facilityTypeCommand.getFacilitiesCommands().add(facilitiesToFacilitiesCommand.convert(facilities)));

        return facilityTypeCommand;
    }
}
