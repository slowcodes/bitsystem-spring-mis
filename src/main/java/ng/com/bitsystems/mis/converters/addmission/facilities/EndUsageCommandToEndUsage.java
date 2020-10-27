package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.EndUsageCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.EndUsage;
import org.springframework.core.convert.converter.Converter;

public class EndUsageCommandToEndUsage implements Converter<EndUsageCommand, EndUsage> {

    private StartUsageCommandToStartUsage startUsageCommandToStartUsage;

    public EndUsageCommandToEndUsage(StartUsageCommandToStartUsage startUsageCommandToStartUsage) {
        this.startUsageCommandToStartUsage = startUsageCommandToStartUsage;
    }

    @Override
    public EndUsage convert(EndUsageCommand source) {
        if(source==null){
            return null;
        }
        final EndUsage endUsage = new EndUsage();
        endUsage.setId(source.getId());
        endUsage.setComment(source.getComment());
        endUsage.setStartUsage(startUsageCommandToStartUsage.convert(source.getStartUsageCommand()));
        endUsage.setStopTime(source.getStopTime());
        return endUsage;
    }
}
