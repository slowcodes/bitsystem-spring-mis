package ng.com.bitsystems.mis.converters.transaction;

import ng.com.bitsystems.mis.command.transactions.ServicePriceCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeCommandToServicePriceCode;
import ng.com.bitsystems.mis.models.transactions.ServiceDetailPricing;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ServicePriceCommandToServicePrice implements Converter<ServicePriceCommand, ServiceDetailPricing> {

    private ServicePriceCodeCommandToServicePriceCode  servicePriceCodeCommandToServicePriceCode;

    public ServicePriceCommandToServicePrice(ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode) {
        this.servicePriceCodeCommandToServicePriceCode = servicePriceCodeCommandToServicePriceCode;
    }

    @Nullable
    @Override
    public ServiceDetailPricing convert(ServicePriceCommand source) {
        if(source==null)
            return null;

        final ServiceDetailPricing serviceDetailPricing = new ServiceDetailPricing();
        serviceDetailPricing.setId(source.getId());
        serviceDetailPricing.setServicePriceCode(servicePriceCodeCommandToServicePriceCode.convert(source.getServicePriceCodeCommand()));
        serviceDetailPricing.setUseDiscountPrice(source.getUseDiscountPrice());
        //serviceDetailPricing.setUserDiscount(source.getUserDiscount());
        return serviceDetailPricing;
    }
}
