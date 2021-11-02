package ng.com.bitsystems.mis.converters.transaction;

import ng.com.bitsystems.mis.command.transactions.ServicePriceCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeToServicePriceCodeCommand;
import ng.com.bitsystems.mis.models.transactions.ServiceDetailPricing;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ServicePriceToServicePriceCommand implements Converter<ServiceDetailPricing, ServicePriceCommand> {
    private ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand;

    public ServicePriceToServicePriceCommand(ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand) {
        this.servicePriceCodeToServicePriceCodeCommand = servicePriceCodeToServicePriceCodeCommand;
    }

    @Override
    public ServicePriceCommand convert(ServiceDetailPricing source) {
        final ServicePriceCommand command = new ServicePriceCommand();
        command.setId(source.getId());
        command.setServicePriceCodeCommand(servicePriceCodeToServicePriceCodeCommand.convert(source.getServicePriceCode()));
        //command.setUserDiscount(source.getUserDiscount());
        command.setUseDiscountPrice(source.getUseDiscountPrice());
        return command;
    }
}
