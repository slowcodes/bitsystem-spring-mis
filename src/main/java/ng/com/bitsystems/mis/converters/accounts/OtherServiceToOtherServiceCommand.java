package ng.com.bitsystems.mis.converters.accounts;

import ng.com.bitsystems.mis.command.accounts.OtherServiceCommand;
import ng.com.bitsystems.mis.models.accounts.OtherServices;
import org.springframework.core.convert.converter.Converter;

public class OtherServiceToOtherServiceCommand implements Converter<OtherServices, OtherServiceCommand> {
    @Override
    public OtherServiceCommand convert(OtherServices source) {
        return null;
    }
}
