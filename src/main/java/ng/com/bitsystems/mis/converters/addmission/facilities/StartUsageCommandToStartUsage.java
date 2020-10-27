package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.StartUsageCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.StartUsage;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientAdmission;
import org.springframework.core.convert.converter.Converter;

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
            InpatientAdmission inpatientAdmission = new InpatientAdmission();
            inpatientAdmission.setId(source.getInpatientAdmissionCommandId());
            startUsage.setInpatientAdmission(inpatientAdmission);
            inpatientAdmission.addFacilityUsage(startUsage);
        }
        return startUsage;
    }
}
