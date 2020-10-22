package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.EndUsageCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.EndUsage;
import org.springframework.core.convert.converter.Converter;

public class EndUsageToEndUsageCommand implements Converter<EndUsage, EndUsageCommand> {
    @Override
    public EndUsageCommand convert(EndUsage source) {
        return null;
    }
}
