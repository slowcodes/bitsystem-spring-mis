package ng.com.bitsystems.mis.converters.accounts;

import ng.com.bitsystems.mis.command.accounts.OtherServiceCommand;
import ng.com.bitsystems.mis.models.accounts.OtherServices;
import org.springframework.core.convert.converter.Converter;

public class OtherServiceCommandToOtherService implements Converter<OtherServiceCommand, OtherServices> {
    @Override
    public OtherServices convert(OtherServiceCommand source) {
        return null;
    }
}
