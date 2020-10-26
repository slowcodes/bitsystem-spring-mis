package ng.com.bitsystems.mis.converters.accounts.pricing;

import ng.com.bitsystems.mis.command.accounts.pricing.RateCommand;
import ng.com.bitsystems.mis.models.accounts.pricing.Rate;
import org.springframework.core.convert.converter.Converter;

public class RateCommandToRate implements Converter<RateCommand, Rate> {
    @Override
    public Rate convert(RateCommand source) {
        return null;
    }
}
