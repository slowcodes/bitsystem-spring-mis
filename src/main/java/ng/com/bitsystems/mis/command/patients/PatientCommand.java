package ng.com.bitsystems.mis.command.patients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientAdmissionCommand;
import ng.com.bitsystems.mis.command.admissions.outpatient.OutpatientAdmissionCommand;
import ng.com.bitsystems.mis.command.consultation.BookConsultationCommand;
import ng.com.bitsystems.mis.command.consultation.ClerksCommand;
import ng.com.bitsystems.mis.command.invoices.InvoiceCommand;
import ng.com.bitsystems.mis.command.laboratories.bloodbank.IssueLogCommand;
import ng.com.bitsystems.mis.command.rewards.loyalties.LoyaltyGainsCommand;
import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionCommand;
import ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank.BloodBankTransactionCommand;
import ng.com.bitsystems.mis.command.transactions.pharmacy.PharmacySalesTransactionCommand;
import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionCommand;
import ng.com.bitsystems.mis.command.users.AccountHolderCommand;
import ng.com.bitsystems.mis.command.users.StateCommand;

import java.time.LocalDate;
import java.util.Date;
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
    private LocalDate regDay;
    private String status;
    private LocalDate lastLoginDay;
    private StateCommand stateCommand;
    private AccountHolderCommand accountHolderCommand;
    private Date dob;
    private String occupation;
    private String maritalStatus;

    private Set<BookConsultationCommand> bookConsultationCommands = new HashSet<>();
    private Set<PatientSocialHistoryCommand> patientSocialHistoryCommand = new HashSet<>();
    private Set<PatientMedicalHistoryCommand> patientMedicalHistoryCommands = new HashSet<>();
    private Set<PharmacySalesTransactionCommand> pharmacySalesTransactionCommands = new HashSet<>();
    private Set<LaboratoryTransactionCommand> laboratoryTransactionCommands = new HashSet<>();
    private Set<IssueLogCommand> issueLogCommands = new HashSet<>();
    private Set<InpatientAdmissionCommand> inpatientAdmissionCommands = new HashSet<>();
    private Set<OutpatientAdmissionCommand> outpatientAdmissionCommands = new HashSet<>();
    private Set<PatientMedicalFileAttachmentCommand> patientMedicalFileAttachmentCommands = new HashSet<>();
    private Set<LoyaltyGainsCommand> loyaltyGainsCommands = new HashSet<>();
    private Set<ClerksCommand> clerksCommands = new HashSet<>();
    private Set<BloodBankTransactionCommand> bloodBankTransactionCommands = new HashSet<>();
    private Set<PatientDrugAllergyCommand> patientDrugAllergyCommands = new HashSet<>();
    private Set <PatientVitalsCommand> patientVitalsCommands = new HashSet<>();
    private Set<InvoiceCommand> invoiceCommands = new HashSet<>();
    private Set<VaccinationTransactionCommand> vaccinationTransactionCommands = new HashSet<>();

}
