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
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonorRegistry;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.IssuanceLogs;
import ng.com.bitsystems.mis.models.referrals.PatientsReferrals;
import ng.com.bitsystems.mis.models.rewards.loyalties.PatientsLoyaltyGains;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransaction;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySalesTransaction;
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

     @ManyToOne
     @JoinColumn(name = "family_folder_id")
     private FamilyFolder familyFolder;

     private Date dob;
     private String occupation;
     private String marritalStatus;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<BookConsultation> bookConsultations = new HashSet<>();

//     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
//     private Set<PatientsReferrals> patientsReferrals = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<PatientsSocialHistory> patientsSocialHistories = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<PatientsMedicalHistory> patientsMedicalHistories = new HashSet<>();

     @OneToOne
     private PatientsReferrals patientsReferrals;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<PharmacySalesTransaction> pharmacySalesTransaction = new HashSet<>();

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

     @OneToOne
     private DonorRegistry donorRegistry;

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

     @OneToOne
     private CompanyFolder companyFolder;

     @ManyToOne
     @JoinColumn(name = "state_id")
     private States states;

    public Patients addInpatientAdmission(InpatientAdmission inpatientAdmission) {
         this.inpatientAdmissions.add(inpatientAdmission);
         inpatientAdmission.setPatients(this);
         return this;
    }
}


