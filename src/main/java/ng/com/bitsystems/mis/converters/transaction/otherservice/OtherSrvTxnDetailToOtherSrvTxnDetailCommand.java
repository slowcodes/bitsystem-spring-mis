package ng.com.bitsystems.mis.converters.transaction.otherservice;

import ng.com.bitsystems.mis.command.transactions.otherservice.OtherServiceTransactionDetailsCommand;
import ng.com.bitsystems.mis.converters.accounts.OtherServiceToOtherServiceCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeToServicePriceCodeCommand;
import ng.com.bitsystems.mis.models.transactions.otherservices.OtherServiceTransactionTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class OtherSrvTxnDetailToOtherSrvTxnDetailCommand implements Converter<OtherServiceTransactionTransactionDetails,
        OtherServiceTransactionDetailsCommand> {

    private ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand;
    private OtherServiceToOtherServiceCommand otherServiceToOtherServiceCommand;

    public OtherSrvTxnDetailToOtherSrvTxnDetailCommand(ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand,
                                                       OtherServiceToOtherServiceCommand otherServiceToOtherServiceCommand) {
        this.servicePriceCodeToServicePriceCodeCommand = servicePriceCodeToServicePriceCodeCommand;
        this.otherServiceToOtherServiceCommand = otherServiceToOtherServiceCommand;
    }

    @Override
    public OtherServiceTransactionDetailsCommand convert(OtherServiceTransactionTransactionDetails source) {
        if(source==null)
            return null;
        final OtherServiceTransactionDetailsCommand command = new OtherServiceTransactionDetailsCommand();
        command.setId(source.getId());
//        command.setComment(source.getComment());
        command.setOtherServiceCommand(otherServiceToOtherServiceCommand.convert(source.getOtherService()));
//        command.setServicePriceCodeCommand(servicePriceCodeToServicePriceCodeCommand.convert(source.getServicePriceCode()));
//        command.setTimeOfTransaction(source.getTimeOfTransaction());
//        command.setUseDiscountPrice(source.getUseDiscountPrice());
//        command.setUserDiscount(source.getUserDiscount());
        if(source.getOtherServiceTransaction()!=null)
            command.setOtherServiceTransactionId(source.getOtherServiceTransaction().getId());
        return command;
    }
}
