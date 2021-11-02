package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.EndUsageCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.EndUsage;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EndUsageToEndUsageCommand implements Converter<EndUsage, EndUsageCommand> {

    private StartUsageToStartUsageCommand startUsageToStartUsageCommand;


    @Override
    public EndUsageCommand convert(EndUsage source) {
        if(source == null){
            return null;
        }
        final EndUsageCommand endUsageCommand = new EndUsageCommand();
        endUsageCommand.setId(source.getId());
        endUsageCommand.setComment(source.getComment());
        endUsageCommand.setStartUsageCommand(startUsageToStartUsageCommand.convert(source.getStartUsage()));
        endUsageCommand.setStopTime(source.getStopTime());
        return endUsageCommand;
    }
}
