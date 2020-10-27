package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.FacilityTypeCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.FacilityTypes;
import org.springframework.core.convert.converter.Converter;

public class FacilityTypeCommandToFacilityType implements Converter<FacilityTypeCommand, FacilityTypes> {

    private FacilitiesCommandToFacilities facilitiesCommandToFacilities;

    public FacilityTypeCommandToFacilityType(FacilitiesCommandToFacilities facilitiesCommandToFacilities) {
        this.facilitiesCommandToFacilities = facilitiesCommandToFacilities;
    }

    @Override
    public FacilityTypes convert(FacilityTypeCommand source) {
        if(source==null){
            return null;
        }
        FacilityTypes facilityTypes = new FacilityTypes();
        facilityTypes.setId(source.getId());
        if(source.getFacilitiesCommands()!=null && source.getFacilitiesCommands().size()>0)
            source.getFacilitiesCommands().forEach(facilitiesCommand -> facilityTypes.getFacilities().add(facilitiesCommandToFacilities.convert(facilitiesCommand)));
        return facilityTypes;
    }
}
