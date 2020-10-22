package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.StartUsageCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.StartUsage;
import org.springframework.core.convert.converter.Converter;

public class StartUsageToStartUsageCommand implements Converter<StartUsage, StartUsageCommand> {
    @Override
    public StartUsageCommand convert(StartUsage source) {
        return null;
    }
}
