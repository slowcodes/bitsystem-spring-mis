package ng.com.bitsystems.mis.converters.addmission.facilities;

import ng.com.bitsystems.mis.command.admissions.facilitties.EndUsageCommand;
import ng.com.bitsystems.mis.models.admissions.facilities.EndUsage;
import org.springframework.core.convert.converter.Converter;

public class EndUsageCommandToEndUsage implements Converter<EndUsageCommand, EndUsage> {
    @Override
    public EndUsage convert(EndUsageCommand source) {
        return null;
    }
}
