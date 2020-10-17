package ng.com.bitsystems.mis.command.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.ExpenseManagerCommand;
import ng.com.bitsystems.mis.command.accounts.OtherServiceCommand;
import ng.com.bitsystems.mis.command.accounts.payments.BloodBankDonationPaymentCommand;
import ng.com.bitsystems.mis.command.accounts.payments.LaboratoryTransactionPaymentCommand;
import ng.com.bitsystems.mis.command.accounts.payments.PharmacyTransactionPaymentCommand;
import ng.com.bitsystems.mis.command.accounts.payments.VaccinationTransactionPaymentCommand;
import ng.com.bitsystems.mis.command.consultation.BookConsultationCommand;
import ng.com.bitsystems.mis.command.consultation.DiseaseDirectoryCommand;
import ng.com.bitsystems.mis.command.inventory.request.RequisitionCommand;
import ng.com.bitsystems.mis.command.laboratories.CollectedSamplesCommand;
import ng.com.bitsystems.mis.command.laboratories.ResultCollectionCommand;
import ng.com.bitsystems.mis.command.laboratories.VerifiedResultCommand;
import ng.com.bitsystems.mis.command.laboratories.bloodbank.DonationCommand;
import ng.com.bitsystems.mis.command.laboratories.bloodbank.DonationQueueCommand;
import ng.com.bitsystems.mis.command.patients.FamilyHistoryCommand;
import ng.com.bitsystems.mis.command.patients.PatientMedicalHistoryCommand;
import ng.com.bitsystems.mis.command.rewards.promo.PromoProductCommand;
import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionCommand;
import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySalesTransactionCommand;
import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionCommand;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class UserCommand {
    private Long id;
    private String middleName;
    private String firstName;
    private String lastName;
    private String sex;
    private String email;
    private String phone;
    private LocalDate regDay;
    private String status;
    private AccountHolderCommand accountHolderCommand;
    private Set<BookConsultationCommand> bookConsultationCommands = new HashSet<>();
    private Set<DonationCommand> donationCommand = new HashSet<>();
    private Set<DonationQueueCommand> donationQueueCommands = new HashSet<>();
    private Set<PatientMedicalHistoryCommand> patientMedicalHistoryCommands = new HashSet<>();
    private Set<FamilyHistoryCommand> familyHistoryCommands = new HashSet<>();
    private Set<ResultCollectionCommand> resultCollectionCommands = new HashSet<>();
    private Set<VerifiedResultCommand> verifiedResultCommands = new HashSet<>();
    private Set<CollectedSamplesCommand> collectedSamplesCommands = new HashSet<>();
    private Set<RequisitionCommand> requisitionCommands = new HashSet<>();
    private Set<DiseaseDirectoryCommand> diseaseDirectoryCommands = new HashSet<>();
    private Set<PromoProductCommand> PromoProductCommad = new HashSet<>();
    private Set<ExpenseManagerCommand> receiver = new HashSet<>();
    private Set<ExpenseManagerCommand> isusser = new HashSet<>();
    private Set<BloodBankDonationPaymentCommand> bloodBankDonationPaymentCommands = new HashSet<>();
    private Set<LaboratoryTransactionPaymentCommand> laboratoryTransactionPaymentCommands = new HashSet<>();
    private Set<OtherServiceCommand> otherServiceCommands = new HashSet<>();
    private Set<PharmacyTransactionPaymentCommand> pharmacyTransactionPaymentsSales=new HashSet<>();
    private Set<VaccinationTransactionPaymentCommand> vaccinationTransactionPaymentCommands = new HashSet<>();
    private Set<LaboratoryTransactionCommand> laboratoryTransactionCommands = new HashSet<>();
    private Set<PharmacySalesTransactionCommand> pharmacySalesTransactionCommands = new HashSet<>();
    private Set<VaccinationTransactionCommand> vaccinationTransactionCommands = new HashSet<>();
}
