package ng.com.bitsystems.mis.converters.accounts;

import ng.com.bitsystems.mis.command.accounts.OtherServiceCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeToServicePriceCodeCommand;
import ng.com.bitsystems.mis.models.accounts.OtherServices;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class OtherServiceToOtherServiceCommand implements Converter<OtherServices, OtherServiceCommand> {
    private ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand;

    public OtherServiceToOtherServiceCommand(ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand) {
        this.servicePriceCodeToServicePriceCodeCommand = servicePriceCodeToServicePriceCodeCommand;
    }

    @Override
    public OtherServiceCommand convert(OtherServices source) {
        if(source==null){
            return null;
        }
        OtherServiceCommand otherServiceCommand = new OtherServiceCommand();
        otherServiceCommand.setId(source.getId());
        if(source.getAccountBook() !=null)
            otherServiceCommand.setExpenseBooksId(source.getAccountBook().getId());
        if(source.getCreatedBy() != null)
            otherServiceCommand.setCreatedById(source.getCreatedBy().getId());
        otherServiceCommand.setDescription(source.getDescription());
//        otherServiceCommand.setFrequency(source.getFrequency());
//        otherServiceCommand.setReversal(source.getReversal());
        otherServiceCommand.setServicePriceCodeCommand(servicePriceCodeToServicePriceCodeCommand.convert(source.getServicePriceCode()));
        otherServiceCommand.setTimeOfTransaction(source.getTimeOfTransaction());


        return otherServiceCommand;
    }
}
