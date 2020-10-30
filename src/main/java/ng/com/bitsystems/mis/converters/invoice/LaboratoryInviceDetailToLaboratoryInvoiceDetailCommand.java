package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.LaboratoryInvoiceDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeToServicePriceCodeCommand;
import ng.com.bitsystems.mis.models.invoice.LaboratoryInvoiceDetails;
import org.springframework.core.convert.converter.Converter;

public class LaboratoryInviceDetailToLaboratoryInvoiceDetailCommand
implements Converter<LaboratoryInvoiceDetails, LaboratoryInvoiceDetailCommand> {
    private ServicePriceCodeToServicePriceCodeCommand servicePriceCodeToServicePriceCodeCommand;
    @Override
    public LaboratoryInvoiceDetailCommand convert(LaboratoryInvoiceDetails source) {
        if(source==null){
            return null;
        }
        final LaboratoryInvoiceDetailCommand laboratoryInvoiceDetailCommand = new LaboratoryInvoiceDetailCommand();
        laboratoryInvoiceDetailCommand.setId(source.getId());
        if(source.getLaboratoryInvestigations()!=null)
            laboratoryInvoiceDetailCommand.setLaboratoryInvestigationId(source.getLaboratoryInvestigations().getId());
        laboratoryInvoiceDetailCommand.setComment(source.getComment());
        laboratoryInvoiceDetailCommand.setFrequency(source.getFrequency());
        if(source.getInvoice()!=null)
            laboratoryInvoiceDetailCommand.setInvoiceId(source.getInvoice().getId());
        laboratoryInvoiceDetailCommand.setReversal(source.getReversal());
        laboratoryInvoiceDetailCommand.setServicePriceCodeCommand(servicePriceCodeToServicePriceCodeCommand.convert(source.getServicePriceCode()));
        laboratoryInvoiceDetailCommand.setTimeOfTransaction(source.getTimeOfTransaction());
        laboratoryInvoiceDetailCommand.setUseDiscountPrice(source.getUseDiscountPrice());
        laboratoryInvoiceDetailCommand.setUserDiscount(source.getUserDiscount());
        return laboratoryInvoiceDetailCommand;
    }
}
