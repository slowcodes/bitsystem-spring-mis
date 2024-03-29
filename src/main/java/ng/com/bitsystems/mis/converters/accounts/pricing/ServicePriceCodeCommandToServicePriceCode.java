package ng.com.bitsystems.mis.converters.accounts.pricing;

import ng.com.bitsystems.mis.command.accounts.pricing.ServicePriceCodeCommand;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import org.springframework.core.convert.converter.Converter;

public class ServicePriceCodeCommandToServicePriceCode implements Converter<ServicePriceCodeCommand, ServicePriceCode> {
    @Override
    public ServicePriceCode convert(ServicePriceCodeCommand source) {
        if(source==null){
            return null;
        }
        ServicePriceCode servicePriceCode = new ServicePriceCode();
        servicePriceCode.setId(source.getId());
        servicePriceCode.setDiscountPrice(source.getDiscountPrice());
        servicePriceCode.setServicePrice(source.getServicePrice());
        servicePriceCode.setTax(source.getTax());
        return servicePriceCode;
    }
}
