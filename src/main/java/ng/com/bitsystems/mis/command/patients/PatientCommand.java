package ng.com.bitsystems.mis.command.patients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.admissions.AdmissionCommand;
import ng.com.bitsystems.mis.command.consultation.BookConsultationCommand;
import ng.com.bitsystems.mis.command.consultation.ClerksCommand;
import ng.com.bitsystems.mis.command.invoices.InvoiceCommand;
import ng.com.bitsystems.mis.command.laboratories.bloodbank.IssueLogCommand;
import ng.com.bitsystems.mis.command.rewards.loyalties.LoyaltyGainsCommand;
import ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank.BloodBankTransactionCommand;
import ng.com.bitsystems.mis.command.users.AccountHolderCommand;
import ng.com.bitsystems.mis.command.users.StateCommand;
import ng.com.bitsystems.mis.models.transactions.Sales;
import ng.com.bitsystems.mis.models.transactions.ServiceTransaction;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class PatientCommand {

    private Long id;
    private String middleName;
    private String firstName;
    private String lastName;
    private String sex;
    private String email;
    private String phone;
    private LocalDateTime regDay;
    private String status;
    private LocalDate lastLoginDay;
    private StateCommand stateCommand;
    private AccountHolderCommand accountHolderCommand;
    private LocalDate dob;
    private String occupation;
    private String maritalStatus;

    private Set<BookConsultationCommand> bookConsultationCommands = new HashSet<>();
    private Set<PatientSocialHistoryCommand> patientSocialHistoryCommand = new HashSet<>();
    private Set<PatientMedicalHistoryCommand> patientMedicalHistoryCommands = new HashSet<>();
    private Set<Sales> sales = new HashSet<>();
    private Set<IssueLogCommand> issueLogCommands = new HashSet<>();
    private Set<AdmissionCommand> admissionCommands = new HashSet<>();
    private Set<PatientMedicalFileAttachmentCommand> patientMedicalFileAttachmentCommands = new HashSet<>();
    private Set<LoyaltyGainsCommand> loyaltyGainsCommands = new HashSet<>();
    private Set<ClerksCommand> clerksCommands = new HashSet<>();
    private Set<BloodBankTransactionCommand> bloodBankTransactionCommands = new HashSet<>();
    private Set<PatientDrugAllergyCommand> patientDrugAllergyCommands = new HashSet<>();
    private Set <PatientVitalsCommand> patientVitalsCommands = new HashSet<>();
    private Set<InvoiceCommand> invoiceCommands = new HashSet<>();
    private Set<ServiceTransaction> serviceTransactions = new HashSet<>();

}
