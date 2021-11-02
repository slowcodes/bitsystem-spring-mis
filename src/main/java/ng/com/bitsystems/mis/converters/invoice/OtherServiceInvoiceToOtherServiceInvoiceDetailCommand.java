package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.OtherServiceInvoiceDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeToServicePriceCodeCommand;
import ng.com.bitsystems.mis.models.invoice.OtherServiceInvoiceDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class OtherServiceInvoiceToOtherServiceInvoiceDetailCommand
implements Converter<OtherServiceInvoiceDetails, OtherServiceInvoiceDetailCommand> {

    private ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand;

    @Override
    public OtherServiceInvoiceDetailCommand convert(OtherServiceInvoiceDetails source) {
        if(source==null){
            return null;
        }
        final OtherServiceInvoiceDetailCommand command=new OtherServiceInvoiceDetailCommand();
        command.setId(source.getId());
        if(source.getCreatedBy()!=null)
            command.setCreatedById(source.getCreatedBy().getId());
        if(source.getAccountBook()!=null)
            command.setExpenseBooksId(source.getAccountBook().getId());
        command.setStatus(source.getStatus());
        if(source.getInvoice()!=null)
            command.setInvoiceId(source.getInvoice().getId());
//        command.setComment(source.getComment());
        command.setDescription(source.getDescription());
//        command.setFrequency(source.getFrequency());
//        command.setReversal(source.getReversal());
        command.setServicePriceCodeCommand(servicePriceCodeToServicePriceCodeCommand.convert(source.getServicePriceCode()));
        command.setTimeOfTransaction(source.getTimeOfTransaction());
//        command.setUseDiscountPrice(source.getUseDiscountPrice());
//        command.setUserDiscount(source.getUserDiscount());

        return command;
    }
}
