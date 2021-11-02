package ng.com.bitsystems.mis.models.invoice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.referrals.Referrals;
import ng.com.bitsystems.mis.models.transactions.BaseTransaction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Invoice extends BaseTransaction {
    private String status;

    @ManyToOne
    @JoinColumn(name = "patientId")
    private Patients patients;

    @ManyToOne
    @JoinColumn(name = "referralId")
    private Referrals referral;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private Set<LaboratoryInvoiceDetails> laboratoryInvoiceDetails = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private Set<OtherServiceInvoiceDetails> otherServiceInvoiceDetails = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private Set<PharmacyInvoiceDetailsSale> pharmacyInvoiceDetailsSales = new HashSet<>();

    public Invoice addLaboratoryInvoiceDetail(LaboratoryInvoiceDetails laboratoryInvoiceDetails) {
        this.laboratoryInvoiceDetails.add(laboratoryInvoiceDetails);
        laboratoryInvoiceDetails.setInvoice(this);
        return this;
    }

    public Invoice addOtherServiceInvoiceDetail(OtherServiceInvoiceDetails otherServiceInvoiceDetails) {
        this.otherServiceInvoiceDetails.add(otherServiceInvoiceDetails);
        otherServiceInvoiceDetails.setInvoice(this);

        return this;
    }

    public Invoice addPharmacyInvoiceDetail(PharmacyInvoiceDetailsSale pharmacyInvoiceDetailsSale) {
        this.pharmacyInvoiceDetailsSales.add(pharmacyInvoiceDetailsSale);
        pharmacyInvoiceDetailsSale.setInvoice(this);
        return this;
    }
}
