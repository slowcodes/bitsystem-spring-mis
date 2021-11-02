package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.FacilitiesCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.RateToRateCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.Facilities;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FacilitiesToFacilitiesCommand implements Converter<Facilities, FacilitiesCommand> {
    private RateToRateCommand rateToRateCommand;

    public FacilitiesToFacilitiesCommand(RateToRateCommand rateToRateCommand) {
        this.rateToRateCommand = rateToRateCommand;
    }

    @Override
    public FacilitiesCommand convert(Facilities source) {
        if(source==null){
            return null;
        }
        final FacilitiesCommand facilitiesCommand =new FacilitiesCommand();
        facilitiesCommand.setId(source.getId());
        if(source.getFacilityTypes()!=null){
           facilitiesCommand.setFacilityTypeCommandId(source.getFacilityTypes().getId());
        }
        if (source.getFacilityTypeCategory() !=null){
            facilitiesCommand.setFacilityTypeCategoryCommandId(source.getFacilityTypeCategory().getId());
        }
        facilitiesCommand.setLocationDescription(source.getLocationDescription());
        facilitiesCommand.setRateCommand(rateToRateCommand.convert(source.getRate()));
        return facilitiesCommand;
    }
}
