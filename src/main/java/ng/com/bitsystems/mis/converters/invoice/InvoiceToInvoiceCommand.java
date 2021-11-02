package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.InvoiceCommand;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class InvoiceToInvoiceCommand implements Converter<Invoice, InvoiceCommand> {

    private LaboratoryInviceDetailToLaboratoryInvoiceDetailCommand laboratoryInviceDetailToLaboratoryInvoiceDetailCommand ;
    private OtherServiceInvoiceToOtherServiceInvoiceDetailCommand otherServiceInvoiceToOtherServiceInvoiceDetailCommand;
    private PharmacyInvoiceDetailToPharmacyInvoiceDetailCommand pharmacyInvoiceDetailToPharmacyInvoiceDetailCommand;

    public InvoiceToInvoiceCommand(LaboratoryInviceDetailToLaboratoryInvoiceDetailCommand laboratoryInviceDetailToLaboratoryInvoiceDetailCommand, OtherServiceInvoiceToOtherServiceInvoiceDetailCommand otherServiceInvoiceToOtherServiceInvoiceDetailCommand,
                                   PharmacyInvoiceDetailToPharmacyInvoiceDetailCommand pharmacyInvoiceDetailToPharmacyInvoiceDetailCommand) {
        this.laboratoryInviceDetailToLaboratoryInvoiceDetailCommand = laboratoryInviceDetailToLaboratoryInvoiceDetailCommand;
        this.otherServiceInvoiceToOtherServiceInvoiceDetailCommand = otherServiceInvoiceToOtherServiceInvoiceDetailCommand;
        this.pharmacyInvoiceDetailToPharmacyInvoiceDetailCommand = pharmacyInvoiceDetailToPharmacyInvoiceDetailCommand;
    }

    @Override
    public InvoiceCommand convert(Invoice source) {
        if(source==null){
            return null;
        }
        InvoiceCommand invoiceCommand=new InvoiceCommand();
        invoiceCommand.setId(source.getId());
        if(source.getAppUsers()!=null)
            invoiceCommand.setUsersId(source.getAppUsers().getId());
        if(source.getPatients()!=null)
            invoiceCommand.setPatientId(source.getPatients().getId());
        if(source.getPharmacyInvoiceDetailsSales().size()>0 && source.getPharmacyInvoiceDetailsSales()!=null)
            source.getPharmacyInvoiceDetailsSales().forEach(pharmacyInvoiceDetailsSale ->
                    invoiceCommand.getPharmacyInvoiceDetailCommands().add(pharmacyInvoiceDetailToPharmacyInvoiceDetailCommand.convert(pharmacyInvoiceDetailsSale)));
        if(source.getLaboratoryInvoiceDetails().size()>0 && source.getLaboratoryInvoiceDetails()!=null)
            source.getLaboratoryInvoiceDetails().forEach(laboratoryInvoiceDetails ->
                    invoiceCommand.getLaboratoryInvoiceDetailCommands().add(laboratoryInviceDetailToLaboratoryInvoiceDetailCommand.convert(laboratoryInvoiceDetails)));
        if(source.getOtherServiceInvoiceDetails().size()>0 && source.getOtherServiceInvoiceDetails()!=null)
            source.getOtherServiceInvoiceDetails().forEach(otherServiceInvoiceDetails ->
                    invoiceCommand.getOtherServiceInvoiceDetailCommands().add(otherServiceInvoiceToOtherServiceInvoiceDetailCommand.convert(otherServiceInvoiceDetails)));
        invoiceCommand.setComment(source.getComment());
        invoiceCommand.setDateTransaction(source.getDateTransaction());
        invoiceCommand.setDiscount(source.getDiscount());
        invoiceCommand.setStatus(source.getStatus());
        if(source.getReferral()!=null)
            invoiceCommand.setReferralId(source.getReferral().getId());
        invoiceCommand.setTimeOfTransaction(source.getTimeOfTransaction());

        return invoiceCommand;
    }
}
