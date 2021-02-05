package ng.com.bitsystems.mis.models.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.AccountBooks;
import ng.com.bitsystems.mis.models.accounts.ExpenseManager;
import ng.com.bitsystems.mis.models.accounts.OtherServices;
import ng.com.bitsystems.mis.models.accounts.payments.*;
import ng.com.bitsystems.mis.models.admissions.inpatients.*;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmission;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientAdmissionDischarged;
import ng.com.bitsystems.mis.models.admissions.outpatient.OutpatientPrescriptions;
import ng.com.bitsystems.mis.models.consultation.BookConsultation;
import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;
import ng.com.bitsystems.mis.models.inventory.requests.Requisitions;
import ng.com.bitsystems.mis.models.invoice.Invoice;
import ng.com.bitsystems.mis.models.invoice.OtherServiceInvoiceDetails;
import ng.com.bitsystems.mis.models.laboratories.CollectedSamples;
import ng.com.bitsystems.mis.models.laboratories.ResultCollectionLog;
import ng.com.bitsystems.mis.models.laboratories.VerifiedResults;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.BleedingSchedule;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonationQueue;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Donations;
import ng.com.bitsystems.mis.models.patients.FamilyHistory;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalFileAttachment;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalHistory;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromosProducts;
import ng.com.bitsystems.mis.models.rewards.promos.VolumedBasedPromos;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransaction;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySalesTransaction;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySupplyTransactions;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Users  extends Person {

    @OneToOne
    private AccountHolder accountHolder;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<BookConsultation> bookConsultations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<Donations> donations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<DonationQueue> donationQueue = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<PatientsMedicalHistory> patientsMedicalHistories = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<ResultCollectionLog> resultCollectionLogs = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<VerifiedResults> verifiedResults = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<CollectedSamples> collectedSamples = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<Requisitions> requisitions = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy")
    private Set<DiseaseDirectory> diseaseDirectory = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<PharmacyPromosProducts> pharmacyPromosProducts = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<VolumedBasedPromos> volumedBasedPromos = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy")
    private Set<AccountBooks> accountBooksCreators = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy")
    private Set<OtherServices> otherServiceCreator = new HashSet<>();
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usersByIssueTo")
    private Set<ExpenseManager> receiver = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usersByTeller")
    private Set<ExpenseManager> isusser = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<BloodbankDonationPayments> bloodbankDonationPayments = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<OtherServicePayments> otherServicePayments = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<LaboratoryTransactionPayments> laboratoryTransactionPayments = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy")
    private Set<OtherServices> otherServices = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<PharmacyTransactionPayments> pharmacyTransactionPaymentsSales=new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<VaccinationTransactionsPayments> vaccinationTransactionsPayments = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<LaboratoryTransaction> laboratoryTransactions = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<BloodbankTransaction> bloodbankTransactions = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<PharmacySalesTransaction> pharmacySalesTransaction = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<PharmacySupplyTransactions> pharmacySupplyTransactions = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<InpatientPrescriptionSchedule> inpatientPrescriptionSchedule = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<InpatientPrescriptions> inpatientPrescriptions = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<InpatientPrescriptionAdministration> inpatientPrescriptionAdministrations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<VaccinationTransaction> vaccinationTransactions = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<InpatientAdmission> inpatientAdmissions = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<InpatientDischarged> inpatientDischargeds = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<OutpatientAdmission> outpatientAdmissions  = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Invoice> invoices  = new HashSet<>();

    @ManyToMany(mappedBy = "users")
    private Set<UserGroups> groups = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy")
    private Set<OtherServiceInvoiceDetails> otherServiceInvoiceDetails = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<BookConsultation> bookConsultation = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<BleedingSchedule> bleedingSchedules = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<ResultCollectionLog> issuedResults = new HashSet<>();

    public Users addBookConsultation(BookConsultation bookConsultation) {
        this.bookConsultation.add(bookConsultation);
        bookConsultation.setUsers(this);
        return this;
    }

    public Users addBleedingSchedule(BleedingSchedule bleedingSchedule) {
        this.bleedingSchedules.add(bleedingSchedule);
        bleedingSchedule.setUsers(this);
        return this;
    }

    public Users addResultCollectionLog(ResultCollectionLog collectionLog) {

        this.issuedResults.add(collectionLog);
        collectionLog.setUsers(this);
        return this;
    }

    public Users addAccountBooks(OtherServiceInvoiceDetails otherServiceInvoiceDetails) {
        this.otherServiceInvoiceDetails.add(otherServiceInvoiceDetails);
        otherServiceInvoiceDetails.setCreatedBy(this);
        return this;
    }

    public Users addBloodBankPayment(BloodbankDonationPayments payments) {
        bloodbankDonationPayments.add(payments);
        payments.setUsers(this);
        return this;
    }

    public Users addLabPayment(LaboratoryTransactionPayments labPayment) {
        laboratoryTransactionPayments.add(labPayment);
        labPayment.setUsers(this);
        return this;
    }

    public Users addOtherServicePayment(OtherServicePayments otherServicePayments) {
        this.otherServicePayments.add(otherServicePayments);
        otherServicePayments.setUsers(this);
        return this;
    }

    public Users addPharmacyPayment(PharmacyTransactionPayments payments) {
        pharmacyTransactionPaymentsSales.add(payments);
        payments.setUsers(this);
        return this;
    }

    public Users addVaccinationPayment(VaccinationTransactionsPayments payments){
        vaccinationTransactionsPayments.add(payments);
        payments.setUsers(this);
        return this;
    }

    public void addReciever(ExpenseManager expenseManager) {
        this.receiver.add(expenseManager);
        expenseManager.setUsersByIssueTo(this);
    }

    public void addIssuer(ExpenseManager expenseManager) {
        this.isusser.add(expenseManager);
        expenseManager.setUsersByIssueTo(this);
    }

    public Users addExpenseBookCreator(AccountBooks accountBooks) {
        this.accountBooksCreators.add(accountBooks);
        accountBooks.setCreatedBy(this);
        return this;
    }

    public Users addOtherServiceCreator(OtherServices otherServices) {
        this.otherServiceCreator.add(otherServices);
        otherServices.setCreatedBy(this);
        return this;
    }

    public Users addInpatientAdmission(InpatientAdmission inpatientAdmission) {
        this.inpatientAdmissions.add(inpatientAdmission);
        inpatientAdmission.setUsers(this);
        return this;
    }

    public Users addInpatientDischarged(InpatientDischarged inpatientDischarged) {
        this.inpatientDischargeds.add(inpatientDischarged);
        inpatientDischarged.setUsers(this);
        return this;
    }

    public Users addInpatientPrescriptionAdministration(InpatientPrescriptionAdministration inpatientPrescriptionAdministration) {
        this.inpatientPrescriptionAdministrations.add(inpatientPrescriptionAdministration);
        inpatientPrescriptionAdministration.setUsers(this);
        return this;
    }

    public Users addInpatientPrescriptionSchedule(InpatientPrescriptionSchedule inpatientPrescriptionSchedule) {
        this.inpatientPrescriptionSchedule.add(inpatientPrescriptionSchedule);
        inpatientPrescriptionSchedule.setUsers(this);
        return this;
    }

    public Users addInpatientPrescription(InpatientPrescriptions inpatientPrescriptions) {
        this.inpatientPrescriptions.add(inpatientPrescriptions);
        inpatientPrescriptions.setUsers(this);
        return this;
    }

    public Users addRequisition(Requisitions requisitions) {
        this.requisitions.add(requisitions);
        requisitions.setUsers(this);
        return this;
    }

    public Users addInvoices(Invoice invoice) {
        this.invoices.add(invoice);
        invoice.setUsers(this);
        return this;
    }


    public Users addPromoProduct(PharmacyPromosProducts pharmacyPromosProducts) {
        this.pharmacyPromosProducts.add(pharmacyPromosProducts);
        pharmacyPromosProducts.setUsers(this);
        return this;
    }

    public Users addVolBasedPromo(VolumedBasedPromos volumedBasedPromos) {
        this.volumedBasedPromos.add(volumedBasedPromos);
        volumedBasedPromos.setUsers(this);
        return this;
    }

    public Users addBloodBankTransaction(BloodbankTransaction transaction) {
        this.bloodbankTransactions.add(transaction);
        transaction.setUsers(this);
        return this;
    }

    public Users addLabTransaction(LaboratoryTransaction transaction) {
        this.laboratoryTransactions.add(transaction);
        transaction.setUsers(this);
        return this;
    }

    public Users addVccTransaction(VaccinationTransaction transaction) {
        this.vaccinationTransactions.add(transaction);
        transaction.setUsers(this);
        return this;
    }

    public Users addPharmSaleTransaction(PharmacySalesTransaction transaction) {
        this.pharmacySalesTransaction.add(transaction);
        transaction.setUsers(this);
        return this;
    }

    public Users addPharmSupplyTransaction(PharmacySupplyTransactions transaction) {
        this.pharmacySupplyTransactions.add(transaction);
        transaction.setUsers(this);
        return this;
    }

    public Users addFamilyHistory(FamilyHistory familyHistory) {
        return this;
    }

    public Users addMedicalFileAttachemt(PatientsMedicalFileAttachment patientsMedicalFileAttachment) {
        return this;
    }

    public Users addClosedOutpatientCase(OutpatientAdmissionDischarged outpatient) {
        return this;
    }

    public Users addAdmittedOutpatients(OutpatientAdmission outpatientAdmission) {
        return this;
    }

    public Users addOutPatientPrecription(OutpatientPrescriptions outpatientPrescriptions) {
        return this;
    }
}


