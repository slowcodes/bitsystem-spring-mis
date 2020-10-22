package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.StartUsageCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.StartUsage;
import org.springframework.core.convert.converter.Converter;

public class StartUsageCommandToStartUsage implements Converter<StartUsageCommand, StartUsage> {
    @Override
    public StartUsage convert(StartUsageCommand source) {
        return null;
    }
}
