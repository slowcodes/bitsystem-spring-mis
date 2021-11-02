package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.StartUsageCommand;
import ng.com.bitsystems.mis.models.admissions.Admission;
import ng.com.bitsystems.mis.models.admissions.facilities.StartUsage;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StartUsageCommandToStartUsage implements Converter<StartUsageCommand, StartUsage> {

    private FacilitiesCommandToFacilities facilitiesCommandToFacilities;


    public StartUsageCommandToStartUsage(FacilitiesCommandToFacilities facilitiesCommandToFacilities) {
        this.facilitiesCommandToFacilities = facilitiesCommandToFacilities;
    }

    @Override
    public StartUsage convert(StartUsageCommand source) {
        if(source==null){
            return null;
        }
        final StartUsage startUsage = new StartUsage();
        startUsage.setId(source.getId());
        startUsage.setStartTime(source.getStartTime());
        startUsage.setFacilities(facilitiesCommandToFacilities.convert(source.getFacilitiesCommand()));

        if(source.getInpatientAdmissionCommandId() !=null){
            Admission admission = new Admission();
            admission.setId(source.getInpatientAdmissionCommandId());
            startUsage.setAdmission(admission);
            admission.addFacilityUsage(startUsage);
        }
        return startUsage;
    }
}
