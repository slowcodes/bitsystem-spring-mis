package ng.com.bitsystems.mis.models.patients;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.admissions.Admission;
import ng.com.bitsystems.mis.models.consultation.BookConsultation;
import ng.com.bitsystems.mis.models.consultation.Clerks;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import ng.com.bitsystems.mis.models.rewards.loyalties.PatientsLoyaltyGains;
import ng.com.bitsystems.mis.models.transactions.Sales;
import ng.com.bitsystems.mis.models.transactions.ServiceTransaction;
import ng.com.bitsystems.mis.models.users.Person;
import ng.com.bitsystems.mis.models.users.States;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patients extends Person {

     @ManyToMany
     private Set<FamilyFolder> familyFolder=new HashSet<>();
     private LocalDate dob;

     private String occupation;

     private String marritalStatus;
     private String address;

     @ManyToOne
     @JoinColumn(name = "state_id")
     private States states;

    @ManyToMany
    @JoinTable(name = "patient_socio_cultural_activity",
            joinColumns = @JoinColumn(name = "patient_id"),
            inverseJoinColumns = @JoinColumn(name = "activity_id"))
    private Set<SocioCulturalDirectory> socialHistory = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<BookConsultation> bookConsultations = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<PatientsMedicalHistory> patientsMedicalHistories = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<Sales> sales = new HashSet<>();

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
    private Set<Admission> admissions = new HashSet();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<PatientsMedicalHistory> patientsFamilyHistories = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<PatientsLoyaltyGains> patientsLoyaltyGainses = new HashSet();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<Clerks> Clerkings = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<PatientDrugAllergy> patientDrugAllergies = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set <PatientsVitals> patientsVitalses = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<Invoice> invoices = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patients")
     private Set<ServiceTransaction> transaction = new HashSet<>();


    public Patients addConsultation(BookConsultation bookConsultation) {
         this.bookConsultations.add(bookConsultation);
         bookConsultation.setPatients(this);
         return this;
    }

    public Patients addInvoice(Invoice invoice) {
         this.invoices.add(invoice);
         //invoice.setPatients(this);
         return this;
    }

    public Patients addDrugAllergy(PatientDrugAllergy patientDrugAllergy) {
         this.patientDrugAllergies.add(patientDrugAllergy);
         patientDrugAllergy.setPatients(this);
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

    public Patients addSocialHistory(SocioCulturalDirectory socioCulturalDirectory) {
        this.socialHistory.add(socioCulturalDirectory);
        //socioCulturalDirectory.setPatients(this);
        return this;
    }

    public Patients addSales(Sales sales) {
        this.sales.add(sales);
        sales.setPatients(this);
        return this;
    }

    public Patients addServiceTransaction(ServiceTransaction transaction) {
        this.transaction.add(transaction);
        transaction.setPatients(this);
        return this;
    }

    public Patients addAdmission(Admission admission) {
        this.admissions.add(admission);
        admission.setPatients(this);
        return this;
    }
}


