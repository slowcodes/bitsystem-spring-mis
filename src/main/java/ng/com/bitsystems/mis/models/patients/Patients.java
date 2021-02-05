package ng.com.bitsystems.mis.models.patients;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientAdmission;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmission;
import ng.com.bitsystems.mis.models.consultation.BookConsultation;
import ng.com.bitsystems.mis.models.consultation.Clerks;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.IssuanceLogs;
import ng.com.bitsystems.mis.models.rewards.loyalties.PatientsLoyaltyGains;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransaction;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySalesTransaction;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactions;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;
import ng.com.bitsystems.mis.models.users.AccountHolder;
import ng.com.bitsystems.mis.models.users.Person;
import ng.com.bitsystems.mis.models.users.States;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patients  extends Person {

     @OneToOne
     private AccountHolder accountHolder;

     @ManyToMany
     private Set<FamilyFolder> familyFolder=new HashSet<>();

     private Date dob;

     private String occupation;

     private String marritalStatus;
     private String address;

     @ManyToOne
     @JoinColumn(name = "state_id")
     private States states;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<BookConsultation> bookConsultations = new HashSet<>();


     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<PatientsSocialHistory> patientsSocialHistories = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<PatientsMedicalHistory> patientsMedicalHistories = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<PharmacySalesTransaction> pharmacySalesTransaction = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
    private Set<PharmacySupplyTransactions> pharmacySupplyTransactions = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<LaboratoryTransaction> laboratoryTransactions = new HashSet();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<PatientsMedicalHistory> patientsFamilyHistories = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<IssuanceLogs> issuanceLogs = new HashSet(0);

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<InpatientAdmission> inpatientAdmissions = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<OutpatientAdmission> outpatientAdmissions = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set <PatientsMedicalFileAttachment> patientsMedicalFileAttachments = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<PatientsLoyaltyGains> patientsLoyaltyGainses = new HashSet();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<Clerks> Clerkings = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set <BloodbankTransaction> bloodbankTransaction = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<PatientDrugAllergy> patientDrugAllergies = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set <PatientsVitals> patientsVitalses = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<Invoice> invoices = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<VaccinationTransaction> vaccinationTransaction = new HashSet<>();

    public Patients addInpatientAdmission(InpatientAdmission inpatientAdmission) {
         this.inpatientAdmissions.add(inpatientAdmission);
         inpatientAdmission.setPatients(this);
         return this;
    }

    public Patients addOutpatientAdmission(OutpatientAdmission outpatientAdmission) {
         this.outpatientAdmissions.add(outpatientAdmission);
         outpatientAdmission.setPatients(this);
         return this;
    }

    public Patients addConsultation(BookConsultation bookConsultation) {
         this.bookConsultations.add(bookConsultation);
         bookConsultation.setPatients(this);
         return this;
    }

    public Patients addInvoice(Invoice invoice) {
         this.invoices.add(invoice);
         invoice.setPatients(this);
         return this;
    }

    public Patients addIssuedBlood(IssuanceLogs issuanceLogs) {
         this.issuanceLogs.add(issuanceLogs);
         issuanceLogs.setPatients(this);
         return this;
    }

    public Patients addDrugAllergy(PatientDrugAllergy patientDrugAllergy) {
         this.patientDrugAllergies.add(patientDrugAllergy);
         patientDrugAllergy.setPatients(this);
         return this;
    }

    public Patients addFileAttachement(PatientsMedicalFileAttachment patientsMedicalFileAttachment) {
         this.patientsMedicalFileAttachments.add(patientsMedicalFileAttachment);
         patientsMedicalFileAttachment.setPatients(this);
         return this;
    }

     public Patients addMedicalHistory(PatientsMedicalHistory patientsMedicalHistory) {
         this.patientsMedicalHistories.add(patientsMedicalHistory);
         patientsMedicalHistory.setPatients(this);
         return this;
     }

    public Patients addVitals(PatientsVitals patientsVitals) {
        this.patientsVitalses.add(patientsVitals);
        patientsVitals.setPatients(this);
        return this;
    }

    public Patients addSocialHistory(PatientsSocialHistory patientsSocialHistory) {
        this.patientsSocialHistories.add(patientsSocialHistory);
        patientsSocialHistory.setPatients(this);
        return this;
    }

    public Patients addBloodBankTransaction(BloodbankTransaction transaction) {
        this.bloodbankTransaction.add(transaction);
        transaction.setPatients(this);
        return this;
    }

    public Patients addPharmSalesTransaction(PharmacySalesTransaction transaction) {
        this.pharmacySalesTransaction.add(transaction);
        transaction.setPatients(this);
        return this;
    }

    public Patients addLabTransaction(LaboratoryTransaction transaction) {
        this.laboratoryTransactions.add(transaction);
        transaction.setPatients(this);
        return this;
    }

    public Patients addVccTransaction(VaccinationTransaction transaction) {
        this.vaccinationTransaction.add(transaction);
        transaction.setPatients(this);
        return this;
    }

    public Patients addPharmSupplyTransaction(PharmacySupplyTransactions transaction) {
        pharmacySupplyTransactions.add(transaction);
        transaction.setPatients(this);
        return this;
    }
}


