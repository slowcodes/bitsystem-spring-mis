package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.StartUsageCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.StartUsage;
import org.springframework.core.convert.converter.Converter;

public class StartUsageToStartUsageCommand implements Converter<StartUsage, StartUsageCommand> {
    private FacilitiesToFacilitiesCommand facilitiesToFacilitiesCommand;

    public StartUsageToStartUsageCommand(FacilitiesToFacilitiesCommand facilitiesToFacilitiesCommand) {
        this.facilitiesToFacilitiesCommand = facilitiesToFacilitiesCommand;
    }

    @Override
    public StartUsageCommand convert(StartUsage source) {
        if(source==null){
            return null;
        }
        StartUsageCommand startUsageCommand=new StartUsageCommand();
        startUsageCommand.setId(source.getId());
        startUsageCommand.setFacilitiesCommand(facilitiesToFacilitiesCommand.convert(source.getFacilities()));
        startUsageCommand.setStartTime(source.getStartTime());
        if(source.getInpatientAdmission()!=null){
            startUsageCommand.setInpatientAdmissionCommandId(source.getInpatientAdmission().getId());
        }
        return startUsageCommand;
    }
}
