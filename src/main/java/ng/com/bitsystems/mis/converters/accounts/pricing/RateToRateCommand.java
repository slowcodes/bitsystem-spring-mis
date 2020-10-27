package ng.com.bitsystems.mis.converters.accounts.pricing;

import ng.com.bitsystems.mis.command.accounts.pricing.RateCommand;
import ng.com.bitsystems.mis.models.accounts.pricing.Rate;
import org.springframework.core.convert.converter.Converter;

public class RateToRateCommand implements Converter<Rate, RateCommand> {
    @Override
    public RateCommand convert(Rate source) {
        if(source==null){
            return null;
        }
        RateCommand rateCommand = new RateCommand();
        rateCommand.setId(source.getId());
        rateCommand.setCost(source.getCost());
        rateCommand.setRateTypes(source.getRateTypes());
        rateCommand.setServiceDescription(source.getService_description());
        rateCommand.setTax(source.getTax());
        return rateCommand;
    }
}
