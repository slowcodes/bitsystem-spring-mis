package ng.com.bitsystems.mis.converters.accounts.pricing;

import ng.com.bitsystems.mis.command.accounts.pricing.RateCommand;
import ng.com.bitsystems.mis.models.accounts.pricing.Rate;
import org.springframework.core.convert.converter.Converter;

public class RateCommandToRate implements Converter<RateCommand, Rate> {

    @Override
    public Rate convert(RateCommand source) {
        if (source==null){
            return null;
        }
        Rate rate = new Rate();
        rate.setId(source.getId());
        rate.setCost(source.getCost());
        rate.setRateTypes(source.getRateTypes());
        rate.setService_description(source.getServiceDescription());
        rate.setTax(source.getTax());
        return rate;
    }
}
