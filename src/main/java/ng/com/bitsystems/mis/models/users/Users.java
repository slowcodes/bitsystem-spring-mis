package ng.com.bitsystems.mis.models.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.ExpenseManager;
import ng.com.bitsystems.mis.models.accounts.OtherServices;
import ng.com.bitsystems.mis.models.accounts.payments.BloodbankDonationPayments;
import ng.com.bitsystems.mis.models.accounts.payments.LaboratoryTransactionPayments;
import ng.com.bitsystems.mis.models.accounts.payments.PharmacyTransactionPayments;
import ng.com.bitsystems.mis.models.accounts.payments.VaccinationTransactionsPayments;
import ng.com.bitsystems.mis.models.consultation.BookConsultation;
import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;
import ng.com.bitsystems.mis.models.inventory.requests.Requisitions;
import ng.com.bitsystems.mis.models.laboratories.CollectedSamples;
import ng.com.bitsystems.mis.models.laboratories.ResultCollectionLog;
import ng.com.bitsystems.mis.models.laboratories.VerifiedResults;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonationQueue;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Donations;
import ng.com.bitsystems.mis.models.patients.PatientsFamilyHistory;
import ng.com.bitsystems.mis.models.patients.PatientsMedicalHistory;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromosProducts;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySalesTransaction;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Users  extends AccountHolder {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<BookConsultation> bookConsultations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<Donations> donations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<DonationQueue> donationQueue = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<PatientsMedicalHistory> patientsMedicalHistories = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<PatientsFamilyHistory> patientsFamilyHistories = new HashSet<>();

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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usersByIssueTo")
    private Set<ExpenseManager> receiver = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usersByTeller")
    private Set<ExpenseManager> isusser = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<BloodbankDonationPayments> bloodbankDonationPayments = new HashSet<>();

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
    private Set<PharmacySalesTransaction> pharmacySalesTransaction = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private Set<VaccinationTransaction> vaccinationTransactions = new HashSet<>();

}


