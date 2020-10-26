package ng.com.bitsystems.mis.converters.accounts.pricing;

import ng.com.bitsystems.mis.command.accounts.pricing.RateCommand;
import ng.com.bitsystems.mis.models.accounts.pricing.Rate;
import org.springframework.core.convert.converter.Converter;

public class RateToRateCommand implements Converter<Rate, RateCommand> {
    @Override
    public RateCommand convert(Rate source) {
        return null;
    }
}
