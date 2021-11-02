package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.FacilitiesCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.RateCommandToRate;
import ng.com.bitsystems.mis.models.admissions.facilities.Facilities;
import ng.com.bitsystems.mis.models.admissions.facilities.FacilityTypeCategory;
import ng.com.bitsystems.mis.models.admissions.facilities.FacilityTypes;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FacilitiesCommandToFacilities implements Converter<FacilitiesCommand, Facilities> {
    private RateCommandToRate rateCommandToRate;

    public FacilitiesCommandToFacilities(RateCommandToRate rateCommandToRate) {
        this.rateCommandToRate = rateCommandToRate;
    }

    @Override
    public Facilities convert(FacilitiesCommand source) {
        if(source ==null){
            return null;
        }
        final Facilities facilities = new Facilities();
        facilities.setId(source.getId());

        if(source.getFacilityTypeCategoryCommandId()!=null){
            FacilityTypeCategory facilityTypeCategory = new FacilityTypeCategory();
            facilityTypeCategory.setId(source.getFacilityTypeCommandId());
            facilities.setFacilityTypeCategory(facilityTypeCategory);
            facilityTypeCategory.addFacility(facilities);
        }

        if(source.getFacilityTypeCommandId() !=null){
            FacilityTypes facilityTypes = new FacilityTypes();
            facilityTypes.setId(source.getFacilityTypeCommandId());
            facilities.setFacilityTypes(facilityTypes);
            facilityTypes.addFacility(facilities);
        }

        facilities.setRate(rateCommandToRate.convert(source.getRateCommand()));
        facilities.setLocationDescription(source.getLocationDescription());
        return facilities;
    }
}
