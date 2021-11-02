package ng.com.bitsystems.mis.converters.invoice;

import ng.com.bitsystems.mis.command.invoices.InvoiceCommand;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.referrals.Referrals;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class InvoiceCommandToInvoice implements Converter<InvoiceCommand, Invoice> {
    private LaboratoryInvoiceDetailCommandToLaboratoryInviceDetail laboratoryInvoiceDetailCommandToLaboratoryInviceDetail;
    private OtherServiceInvoiceDetailCommandToOtherServiceInvoice otherServiceInvoiceDetailCommandToOtherServiceInvoice;
    private PharmacyInvoiceDetailCommandToPharmacyInvoiceDetail pharmacyInvoiceDetailCommandToPharmacyInvoiceDetail;

    public InvoiceCommandToInvoice(LaboratoryInvoiceDetailCommandToLaboratoryInviceDetail laboratoryInvoiceDetailCommandToLaboratoryInviceDetail,
                                   OtherServiceInvoiceDetailCommandToOtherServiceInvoice otherServiceInvoiceDetailCommandToOtherServiceInvoice,
                                   PharmacyInvoiceDetailCommandToPharmacyInvoiceDetail pharmacyInvoiceDetailCommandToPharmacyInvoiceDetail) {
        this.laboratoryInvoiceDetailCommandToLaboratoryInviceDetail = laboratoryInvoiceDetailCommandToLaboratoryInviceDetail;
        this.otherServiceInvoiceDetailCommandToOtherServiceInvoice = otherServiceInvoiceDetailCommandToOtherServiceInvoice;
        this.pharmacyInvoiceDetailCommandToPharmacyInvoiceDetail = pharmacyInvoiceDetailCommandToPharmacyInvoiceDetail;
    }

    @Override
    public Invoice convert(InvoiceCommand source) {
        if(source==null){
            return null;
        }
        final Invoice invoice = new Invoice();
        invoice.setId(source.getId());

        if(source.getLaboratoryInvoiceDetailCommands()!=null && source.getLaboratoryInvoiceDetailCommands().size()>0)
            source.getLaboratoryInvoiceDetailCommands().forEach(laboratoryInvoiceDetailCommand ->
                    invoice.getLaboratoryInvoiceDetails().add(laboratoryInvoiceDetailCommandToLaboratoryInviceDetail.convert(laboratoryInvoiceDetailCommand)));

        if(source.getOtherServiceInvoiceDetailCommands() !=null && source.getOtherServiceInvoiceDetailCommands().size()>0)
            source.getOtherServiceInvoiceDetailCommands().forEach(otherServiceInvoiceDetailCommand ->
                    invoice.getOtherServiceInvoiceDetails().add(otherServiceInvoiceDetailCommandToOtherServiceInvoice.convert(otherServiceInvoiceDetailCommand)));

        if(source.getPharmacyInvoiceDetailCommands()!=null && source.getPharmacyInvoiceDetailCommands().size()>0)
            source.getPharmacyInvoiceDetailCommands().forEach(pharmacyInvoiceDetailCommand ->
                    invoice.getPharmacyInvoiceDetailsSales().add(pharmacyInvoiceDetailCommandToPharmacyInvoiceDetail.convert(pharmacyInvoiceDetailCommand)));
        invoice.setStatus(source.getStatus());
        invoice.setComment(source.getComment());
        invoice.setDateTransaction(source.getDateTransaction());
        invoice.setDiscount(source.getDiscount());
        if(source.getPatientId()!=null){
            Patients patients = new Patients();
            patients.setId(source.getPatientId());
            invoice.setPatients(patients);
            Patients patients1=patients.addInvoice(invoice);
        }
        if(source.getReferralId()!=null){
            Referrals referrals=new Referrals();
            referrals.setId(source.getReferralId());
            //invoice.setReferral(referrals);
            Referrals referral= referrals.addInvoice(invoice);
        }
        invoice.setTimeOfTransaction(source.getTimeOfTransaction());

        if(source.getUsersId() != null){
            AppUsers appUsers =new AppUsers();
            appUsers.setId(source.getPatientId());
            invoice.setAppUsers(appUsers);
            AppUsers urs= appUsers.addInvoices(invoice);
        }
        return invoice;
    }
}
