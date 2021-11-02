package ng.com.bitsystems.mis.models.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.AccountBooks;
import ng.com.bitsystems.mis.models.accounts.ExpenseManager;
import ng.com.bitsystems.mis.models.accounts.OtherServices;
import ng.com.bitsystems.mis.models.accounts.payments.Payments;
import ng.com.bitsystems.mis.models.admissions.Admission;
import ng.com.bitsystems.mis.models.admissions.Discharged;
import ng.com.bitsystems.mis.models.consultation.BookConsultation;
import ng.com.bitsystems.mis.models.consultation.Specializations;
import ng.com.bitsystems.mis.models.inventory.requests.Requisitions;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import ng.com.bitsystems.mis.models.invoice.OtherServiceInvoiceDetails;
import ng.com.bitsystems.mis.models.laboratories.CollectedSamples;
import ng.com.bitsystems.mis.models.laboratories.ResultCollectionLog;
import ng.com.bitsystems.mis.models.laboratories.Results;
import ng.com.bitsystems.mis.models.laboratories.VerifiedResults;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.*;
import ng.com.bitsystems.mis.models.pharmacy.Prescription;
import ng.com.bitsystems.mis.models.pharmacy.PrescriptionSchedule;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromosProducts;
import ng.com.bitsystems.mis.models.rewards.promos.VolumedBasedPromos;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@DiscriminatorColumn("username")
public class AppUsers extends Person {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<Transaction> transaction = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<BookConsultation> bookConsultations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<Prescription> prescriptions  = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<Donations> donations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<DonationQueue> donationQueue = new HashSet<>();


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<ResultCollectionLog> resultCollectionLogs = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<VerifiedResults> verifiedResults = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<CollectedSamples> collectedSamples = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "consultants_specializations",
            joinColumns = @JoinColumn(name = "consultants_id"),
            inverseJoinColumns = @JoinColumn(name = "specializations_id"))
    private Set<Specializations> specializations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<Requisitions> requisitions = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<PharmacyPromosProducts> pharmacyPromosProducts = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<VolumedBasedPromos> volumedBasedPromos = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy")
    private Set<AccountBooks> accountBooksCreators = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy")
    private Set<OtherServices> otherServiceCreator = new HashSet<>();
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsersByIssueTo")
    private Set<ExpenseManager> receiver = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsersByTeller")
    private Set<ExpenseManager> isusser = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<Payments> payments = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<PrescriptionSchedule> prescriptionSchedule = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Admission> admissions = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Discharged> dischargeds = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Invoice> invoices  = new HashSet<>();

    @ManyToMany(mappedBy = "appUsers")
    private Set<UserGroups> groups = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy")
    private Set<OtherServiceInvoiceDetails> otherServiceInvoiceDetails = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<BookConsultation> bookConsultation = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<BleedingSchedule> bleedingSchedules = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<ResultCollectionLog> issuedResults = new HashSet<>();

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
//    private Set<PatientsMedicalHistory> patientsMedicalHistories=new HashSet<>();



//    @ManyToMany
//    private Set<Specializations> specializations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<ClearedQueue> clearedQueues = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<DonationQueue> donationQueues = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<IssuanceLogs> issuanceLogs = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "appUsers")
    private Set<Results> results = new HashSet<>();


    public AppUsers addClearedQueue(ClearedQueue clearedQueue) {
        this.clearedQueues.add(clearedQueue);
        //clearedQueue.setAppUsers(this);
        return this;
    }

    public AppUsers addDonationQueue(DonationQueue donationQueue) {
        this.donationQueues.add(donationQueue);
        //donationQueue.setAppUsers(this);
        return this;
    }

    public AppUsers addIssuedLog(IssuanceLogs issuanceLogs) {
        this.issuanceLogs.add(issuanceLogs);
        //issuanceLogs.setAppUsers(this);
        return this;
    }

    public AppUsers addCollectedSample(CollectedSamples collectedSamples) {
        this.collectedSamples.add(collectedSamples);
        //collectedSamples.setAppUsers(this);
        return this;
    }

    public AppUsers addCreatedResults(Results results) {
        this.results.add(results);
        //results.setAppUsers(this);
        return this;
    }

    public AppUsers addVerifiedResult(VerifiedResults verifiedResults) {
        this.verifiedResults.add(verifiedResults);
        //verifiedResults.setAppUsers(this);
        return this;
    }


    public AppUsers addBookConsultation(BookConsultation bookConsultation) {
        this.bookConsultation.add(bookConsultation);
        bookConsultation.setAppUsers(this);
        return this;
    }

    public AppUsers addBleedingSchedule(BleedingSchedule bleedingSchedule) {
        this.bleedingSchedules.add(bleedingSchedule);
        bleedingSchedule.setAppUsers(this);
        return this;
    }

    public AppUsers addResultCollectionLog(ResultCollectionLog collectionLog) {

        this.issuedResults.add(collectionLog);
        collectionLog.setAppUsers(this);
        return this;
    }

    public AppUsers addAccountBooks(OtherServiceInvoiceDetails otherServiceInvoiceDetails) {
        this.otherServiceInvoiceDetails.add(otherServiceInvoiceDetails);
        otherServiceInvoiceDetails.setCreatedBy(this);
        return this;
    }

    public AppUsers addPayment(Payments payments){
        this.payments.add(payments);
        payments.setAppUsers(this);
        return this;
    }

    public void addReciever(ExpenseManager expenseManager) {
        this.receiver.add(expenseManager);
        expenseManager.setAppUsersByIssueTo(this);
    }

    public void addIssuer(ExpenseManager expenseManager) {
        this.isusser.add(expenseManager);
        expenseManager.setAppUsersByIssueTo(this);
    }

    public AppUsers addExpenseBookCreator(AccountBooks accountBooks) {
        this.accountBooksCreators.add(accountBooks);
        accountBooks.setCreatedBy(this);
        return this;
    }

    public AppUsers addOtherServiceCreator(OtherServices otherServices) {
        this.otherServiceCreator.add(otherServices);
        otherServices.setCreatedBy(this);
        return this;
    }

    public AppUsers addRequisition(Requisitions requisitions) {
        this.requisitions.add(requisitions);
        requisitions.setAppUsers(this);
        return this;
    }

    public AppUsers addInvoices(Invoice invoice) {
        this.invoices.add(invoice);
        invoice.setAppUsers(this);
        return this;
    }

    public AppUsers addPromoProduct(PharmacyPromosProducts pharmacyPromosProducts) {
        this.pharmacyPromosProducts.add(pharmacyPromosProducts);
        pharmacyPromosProducts.setAppUsers(this);
        return this;
    }

    public AppUsers addVolBasedPromo(VolumedBasedPromos volumedBasedPromos) {
        this.volumedBasedPromos.add(volumedBasedPromos);
        volumedBasedPromos.setAppUsers(this);
        return this;
    }


    public AppUsers addTransaction(Transaction transaction) {
        this.transaction.add(transaction);
        transaction.setAppUsers(this);
        return this;
    }

    public AppUsers addAdmission(Admission admission) {
        this.admissions.add(admission);
        admission.setAppUsers(this);
        return this;
    }

    public AppUsers addDischarged(Discharged discharged) {
        this.dischargeds.add(discharged);
        discharged.setAppUsers(this);
        return this;
    }

    public AppUsers addPrescription(Prescription prescription) {
        this.prescriptions.add(prescription);
        prescription.setAppUsers(this);
        return this;
    }

    public AppUsers addPrescriptionSchedule(PrescriptionSchedule prescriptionSchedule) {
        this.prescriptionSchedule.add(prescriptionSchedule);
        prescriptionSchedule.setAppUsers(this);
        return this;
    }
}


