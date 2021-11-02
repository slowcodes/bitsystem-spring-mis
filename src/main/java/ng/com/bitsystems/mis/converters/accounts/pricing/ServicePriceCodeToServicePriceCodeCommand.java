package ng.com.bitsystems.mis.converters.accounts.pricing;

import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ServicePriceCodeToServicePriceCodeCommand implements Converter<ServicePriceCode, ServicePriceCodeCommand> {
    @Override
    public ServicePriceCodeCommand convert(ServicePriceCode source) {
        if(source==null){
            return null;
        }
        ServicePriceCodeCommand servicePriceCodeCommand = new ServicePriceCodeCommand();
        servicePriceCodeCommand.setId(source.getId());
        servicePriceCodeCommand.setDiscountPrice(source.getDiscountPrice());
        servicePriceCodeCommand.setServicePrice(source.getServicePrice());
        servicePriceCodeCommand.setTax(source.getTax());
        return servicePriceCodeCommand;
    }
}
