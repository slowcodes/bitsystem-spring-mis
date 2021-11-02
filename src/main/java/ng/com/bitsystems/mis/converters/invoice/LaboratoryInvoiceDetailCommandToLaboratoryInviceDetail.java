package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.LaboratoryInvoiceDetailCommand;
import ng.com.bitsystems.mis.converters.accounts.pricing.ServicePriceCodeCommandToServicePriceCode;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import ng.com.bitsystems.mis.models.invoice.LaboratoryInvoiceDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class LaboratoryInvoiceDetailCommandToLaboratoryInviceDetail
implements Converter<LaboratoryInvoiceDetailCommand, LaboratoryInvoiceDetails> {
    
    private ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode;

    public LaboratoryInvoiceDetailCommandToLaboratoryInviceDetail(ServicePriceCodeCommandToServicePriceCode servicePriceCodeCommandToServicePriceCode) {
        this.servicePriceCodeCommandToServicePriceCode = servicePriceCodeCommandToServicePriceCode;
    }

    @Override
    public LaboratoryInvoiceDetails convert(LaboratoryInvoiceDetailCommand source) {
        if(source==null){
            return null;
        }
        LaboratoryInvoiceDetails laboratoryInvoiceDetails = new LaboratoryInvoiceDetails();
        laboratoryInvoiceDetails.setId(source.getId());
        if(source.getInvoiceId()!=null){
            Invoice invoice=new Invoice();
            invoice.setId(source.getInvoiceId());
            laboratoryInvoiceDetails.setInvoice(invoice);
            Invoice inv = invoice.addLaboratoryInvoiceDetail(laboratoryInvoiceDetails);
        }

//        if(source.getLaboratoryInvestigationId()!=null){
//            Investigations laboratoryInvestigations=new Investigations();
//            laboratoryInvestigations.setId(source.getLaboratoryInvestigationId());
//            laboratoryInvoiceDetails.setInvestigations(laboratoryInvestigations);
//            Investigations labInv = laboratoryInvestigations.addLabInvDetails(laboratoryInvoiceDetails);
//        }

//        laboratoryInvoiceDetails.setComment(source.getComment());
//        laboratoryInvoiceDetails.setFrequency(source.getFrequency());
//        laboratoryInvoiceDetails.setReversal(source.getReversal());
//      laboratoryInvoiceDetails.setServicePriceCode(servicePriceCodeCommandToServicePriceCode.convert(source.getServicePriceCodeCommand()));
//        laboratoryInvoiceDetails.setTimeOfTransaction(source.getTimeOfTransaction());
//      laboratoryInvoiceDetails.setUseDiscountPrice(source.getUseDiscountPrice());
//        laboratoryInvoiceDetails.setUserDiscount(source.getUserDiscount());

        return laboratoryInvoiceDetails;
    }
}
