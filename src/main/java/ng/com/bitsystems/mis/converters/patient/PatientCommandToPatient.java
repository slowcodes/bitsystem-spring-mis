package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientCommand;
import ng.com.bitsystems.mis.converters.accounts.OtherServiceCommandToOtherService;
import ng.com.bitsystems.mis.converters.accounts.payment.BloodBankDonationPaymentCommandToBloodBankDonationPayment;
import ng.com.bitsystems.mis.converters.accounts.payment.LaboratoryTransactionPaymentCommandToLaboratoryTransactionPayment;
import ng.com.bitsystems.mis.converters.accounts.payment.PharmacyTransactionPaymentCommandToPharmacyTransactionPayment;
import ng.com.bitsystems.mis.converters.accounts.payment.VaccinationTransactionPaymentCommandToVaccinationTransactionPayment;
import ng.com.bitsystems.mis.converters.addmission.inpatient.InpatientAdmCmdToInpatientAdm;
import ng.com.bitsystems.mis.converters.addmission.outpatient.OutpatientAdmissionCommandToOutpatientAdmission;
import ng.com.bitsystems.mis.converters.consultation.BookConsultationCommandToBookConsultation;
import ng.com.bitsystems.mis.converters.consultation.ClerkCommandToClerk;
import ng.com.bitsystems.mis.converters.invoice.InvoiceCommandToInvoice;
import ng.com.bitsystems.mis.converters.laboratory.bloodbank.IssueLogCommandToIssueLog;
import ng.com.bitsystems.mis.converters.reward.loyalty.LoyaltyActivityCommandToLoyaltyActivity;
import ng.com.bitsystems.mis.converters.reward.loyalty.LoyaltyGainCommandToLoyaltyGain;
import ng.com.bitsystems.mis.converters.reward.promo.ReceivedLogCommandToReceivedLog;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnCommandToLabTxn;
import ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank.BBTxnCommandToBBTxn;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.PharmSalesTxnCommandToPharmSaleTxn;
import ng.com.bitsystems.mis.converters.transaction.vaccination.VaccTxnCommandToVaccTxn;
import ng.com.bitsystems.mis.converters.user.AccountHolderCommandToAccountHolder;
import ng.com.bitsystems.mis.converters.user.StateCommandToState;
import ng.com.bitsystems.mis.models.patients.Patients;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class PatientCommandToPatient implements Converter<PatientCommand, Patients> {
    private StateCommandToState stateCommandToState;
    private AccountHolderCommandToAccountHolder accountHolderCommandToAccountHolder;
    private BBTxnCommandToBBTxn bbTxnCommandToBBTxn;
    private PharmSalesTxnCommandToPharmSaleTxn pharmSalesTxnCommandToPharmSaleTxn;
    private OtherServiceCommandToOtherService otherServiceCommandToOtherService;
    private LabTxnCommandToLabTxn labTxnCommandToLabTxn;
    private InpatientAdmCmdToInpatientAdm inpatientAdmCmdToInpatientAdm;
    private OutpatientAdmissionCommandToOutpatientAdmission outpatientAdmissionCommandToOutpatientAdmission;
    private BookConsultationCommandToBookConsultation bookConsultationCommandToBookConsultatio;
    private IssueLogCommandToIssueLog issueLogCommandToIssueLog;
    private MedicalHistoryCommandToMedicalHistory medicalHistoryCommandToMedicalHistory;
    private SocialHistoryCommandToSocialHistory socialHistoryCommandToSocialHistory;
    private DrugAllergyCommandToDrugAllergy drugAllergyCommandToDrugAllergy;
    private PatientVitalCommandToPatientVital patientVitalCommandToPatientVital;
    private VaccTxnCommandToVaccTxn vaccTxnCommandToVaccTxn;
    private LaboratoryTransactionPaymentCommandToLaboratoryTransactionPayment laboratoryTransactionPaymentCommandToLaboratoryTransactionPayment;
    private PharmacyTransactionPaymentCommandToPharmacyTransactionPayment pharmacyTransactionPaymentCommandToPharmacyTransactionPayment;
    private BloodBankDonationPaymentCommandToBloodBankDonationPayment bloodBankDonationPaymentCommandToBloodBankDonationPayment;
    private VaccinationTransactionPaymentCommandToVaccinationTransactionPayment vaccinationTransactionPaymentCommandToVaccinationTransactionPayment;
    private ClerkCommandToClerk clerkCommandToClerk;
    private InvoiceCommandToInvoice invoiceToInvoiceCommand;
    private LoyaltyActivityCommandToLoyaltyActivity loyaltyActivityCommandToLoyaltyActivity;
    private LoyaltyGainCommandToLoyaltyGain loyaltyGainCommandToLoyaltyGain;
    private ReceivedLogCommandToReceivedLog receivedLogCommandToReceivedLog;
    private FileAttachementCommandToFileAttachment fileAttachementCommandToFileAttachment;

    public PatientCommandToPatient(StateCommandToState stateCommandToState, AccountHolderCommandToAccountHolder accountHolderCommandToAccountHolder, BBTxnCommandToBBTxn bbTxnCommandToBBTxn, PharmSalesTxnCommandToPharmSaleTxn pharmSalesTxnCommandToPharmSaleTxn, OtherServiceCommandToOtherService otherServiceCommandToOtherService, LabTxnCommandToLabTxn labTxnCommandToLabTxn, InpatientAdmCmdToInpatientAdm inpatientAdmCmdToInpatientAdm, OutpatientAdmissionCommandToOutpatientAdmission outpatientAdmissionCommandToOutpatientAdmission, BookConsultationCommandToBookConsultation bookConsultationCommandToBookConsultatio, IssueLogCommandToIssueLog issueLogCommandToIssueLog, MedicalHistoryCommandToMedicalHistory medicalHistoryCommandToMedicalHistory, SocialHistoryCommandToSocialHistory socialHistoryCommandToSocialHistory, DrugAllergyCommandToDrugAllergy drugAllergyCommandToDrugAllergy, PatientVitalCommandToPatientVital patientVitalCommandToPatientVital, VaccTxnCommandToVaccTxn vaccTxnCommandToVaccTxn, LaboratoryTransactionPaymentCommandToLaboratoryTransactionPayment laboratoryTransactionPaymentCommandToLaboratoryTransactionPayment, PharmacyTransactionPaymentCommandToPharmacyTransactionPayment pharmacyTransactionPaymentCommandToPharmacyTransactionPayment, BloodBankDonationPaymentCommandToBloodBankDonationPayment bloodBankDonationPaymentCommandToBloodBankDonationPayment, VaccinationTransactionPaymentCommandToVaccinationTransactionPayment vaccinationTransactionPaymentCommandToVaccinationTransactionPayment, ClerkCommandToClerk clerkCommandToClerk, InvoiceCommandToInvoice invoiceToInvoiceCommand, LoyaltyActivityCommandToLoyaltyActivity loyaltyActivityCommandToLoyaltyActivity, LoyaltyGainCommandToLoyaltyGain loyaltyGainCommandToLoyaltyGain, ReceivedLogCommandToReceivedLog receivedLogCommandToReceivedLog, FileAttachementCommandToFileAttachment fileAttachementCommandToFileAttachment) {
        this.stateCommandToState = stateCommandToState;
        this.accountHolderCommandToAccountHolder = accountHolderCommandToAccountHolder;
        this.bbTxnCommandToBBTxn = bbTxnCommandToBBTxn;
        this.pharmSalesTxnCommandToPharmSaleTxn = pharmSalesTxnCommandToPharmSaleTxn;
        this.otherServiceCommandToOtherService = otherServiceCommandToOtherService;
        this.labTxnCommandToLabTxn = labTxnCommandToLabTxn;
        this.inpatientAdmCmdToInpatientAdm = inpatientAdmCmdToInpatientAdm;
        this.outpatientAdmissionCommandToOutpatientAdmission = outpatientAdmissionCommandToOutpatientAdmission;
        this.bookConsultationCommandToBookConsultatio = bookConsultationCommandToBookConsultatio;
        this.issueLogCommandToIssueLog = issueLogCommandToIssueLog;
        this.medicalHistoryCommandToMedicalHistory = medicalHistoryCommandToMedicalHistory;
        this.socialHistoryCommandToSocialHistory = socialHistoryCommandToSocialHistory;
        this.drugAllergyCommandToDrugAllergy = drugAllergyCommandToDrugAllergy;
        this.patientVitalCommandToPatientVital = patientVitalCommandToPatientVital;
        this.vaccTxnCommandToVaccTxn = vaccTxnCommandToVaccTxn;
        this.laboratoryTransactionPaymentCommandToLaboratoryTransactionPayment = laboratoryTransactionPaymentCommandToLaboratoryTransactionPayment;
        this.pharmacyTransactionPaymentCommandToPharmacyTransactionPayment = pharmacyTransactionPaymentCommandToPharmacyTransactionPayment;
        this.bloodBankDonationPaymentCommandToBloodBankDonationPayment = bloodBankDonationPaymentCommandToBloodBankDonationPayment;
        this.vaccinationTransactionPaymentCommandToVaccinationTransactionPayment = vaccinationTransactionPaymentCommandToVaccinationTransactionPayment;
        this.clerkCommandToClerk = clerkCommandToClerk;
        this.invoiceToInvoiceCommand = invoiceToInvoiceCommand;
        this.loyaltyActivityCommandToLoyaltyActivity = loyaltyActivityCommandToLoyaltyActivity;
        this.loyaltyGainCommandToLoyaltyGain = loyaltyGainCommandToLoyaltyGain;
        this.receivedLogCommandToReceivedLog = receivedLogCommandToReceivedLog;
        this.fileAttachementCommandToFileAttachment = fileAttachementCommandToFileAttachment;
    }

    @Nullable
    @Override
    public Patients convert(PatientCommand source) {

        if(source==null)
            return null;

        final Patients patients=new Patients();

        patients.setId(source.getId());
        patients.setId(source.getId());
        patients.setStatus(source.getStatus());
        patients.setRegDay(source.getRegDay());
        patients.setSex(source.getSex());
        patients.setPhone(source.getPhone());
        patients.setMiddleName(source.getMiddleName());
        patients.setFirstName(source.getFirstName());
        patients.setLastName(source.getLastName());
        patients.setLastLoginDay(source.getLastLoginDay());
        patients.setEmail(source.getEmail());
        patients.setStates(stateCommandToState.convert(source.getStateCommand()));
        patients.setAccountHolder(accountHolderCommandToAccountHolder.convert(source.getAccountHolderCommand()));
        patients.setDob(source.getDob());

        if(source.getBloodBankTransactionCommands().size()>0 && source.getBloodBankTransactionCommands()!=null)
            source.getBloodBankTransactionCommands().forEach(bloodBankTransactionCommand ->
                    patients.getBloodbankTransaction().add(
                            bbTxnCommandToBBTxn.convert(bloodBankTransactionCommand)
                    ));

        if(source.getBookConsultationCommands().size()>0 && source.getBookConsultationCommands()!=null)
            source.getBookConsultationCommands().forEach(bookConsultationCommand ->
                    patients.getBookConsultations().add(bookConsultationCommandToBookConsultatio.convert(bookConsultationCommand)));

        if(source.getClerksCommands().size()>0 && source.getClerksCommands()!=null)
            source.getClerksCommands().forEach(clerksCommand ->
                    patients.getClerkings().add(clerkCommandToClerk.convert(clerksCommand)));

        if(source.getInpatientAdmissionCommands().size()>0 && source.getInpatientAdmissionCommands()!=null)
            source.getInpatientAdmissionCommands().forEach(inpatientAdmissionCommand ->
                    patients.getInpatientAdmissions().add(inpatientAdmCmdToInpatientAdm.convert(
                            inpatientAdmissionCommand
                    )));

        if(source.getInvoiceCommands().size()>0 && source.getInvoiceCommands()!=null)
            source.getInvoiceCommands().forEach(invoiceCommand ->
                    patients.getInvoices().add(
                            invoiceToInvoiceCommand.convert(invoiceCommand)
                    ));

        if(source.getVaccinationTransactionCommands().size()>0 && source.getVaccinationTransactionCommands()!=null)
            source.getVaccinationTransactionCommands().forEach(vaccinationTransactionCommand ->
                    patients.getVaccinationTransaction().add(vaccTxnCommandToVaccTxn.convert(vaccinationTransactionCommand)));


        if(source.getPharmacySalesTransactionCommands().size()>0 && source.getPharmacySalesTransactionCommands()!=null)
            source.getPharmacySalesTransactionCommands().forEach(pharmacySalesTransactionCommand ->
                    patients.getPharmacySalesTransaction().add(
                            pharmSalesTxnCommandToPharmSaleTxn.convert(pharmacySalesTransactionCommand)
                    ));


        if(source.getPatientVitalsCommands().size()>0 && source.getPatientVitalsCommands()!=null)
            source.getPatientVitalsCommands().forEach(patientVitalsCommand ->
                    patients.getPatientsVitalses().add(
                            patientVitalCommandToPatientVital.convert(patientVitalsCommand)
                    ));

        if(source.getPatientSocialHistoryCommand().size()>0 && source.getPatientSocialHistoryCommand()!=null)
            source.getPatientSocialHistoryCommand().forEach(patientSocialHistoryCommand ->
                    patients.getPatientsSocialHistories().add(
                            socialHistoryCommandToSocialHistory.convert(patientSocialHistoryCommand)
                    ));

        if(source.getIssueLogCommands().size()>0 && source.getIssueLogCommands()!=null)
            source.getIssueLogCommands().forEach(issueLogCommand ->
                    patients.getIssuanceLogs().add(issueLogCommandToIssueLog.convert(
                            issueLogCommand
                    )));

        if(source.getLaboratoryTransactionCommands().size()>0 && source.getLaboratoryTransactionCommands()!=null)
            source.getLaboratoryTransactionCommands().forEach(laboratoryTransactionCommand ->
                    patients.getLaboratoryTransactions().add(labTxnCommandToLabTxn.convert(laboratoryTransactionCommand)));

        if(source.getLoyaltyGainsCommands().size()>0 && source.getLoyaltyGainsCommands()!=null)
            source.getLoyaltyGainsCommands().forEach(loyaltyGainsCommand ->
                    patients.getPatientsLoyaltyGainses().add(loyaltyGainCommandToLoyaltyGain.convert(
                            loyaltyGainsCommand
                    )));

        if (source.getOutpatientAdmissionCommands().size()>0 && source.getOutpatientAdmissionCommands()!=null)
            source.getOutpatientAdmissionCommands().forEach(outpatientAdmissionCommand ->
                    patients.getOutpatientAdmissions().add(
                            outpatientAdmissionCommandToOutpatientAdmission.convert(outpatientAdmissionCommand)
                    ));

        if (source.getPatientDrugAllergyCommands().size()>0 && source.getPatientDrugAllergyCommands()!=null)
            source.getPatientDrugAllergyCommands().forEach(patientDrugAllergyCommand ->
                    patients.getPatientDrugAllergies().add(drugAllergyCommandToDrugAllergy.convert(
                            patientDrugAllergyCommand
                    )));

        if(source.getPatientMedicalFileAttachmentCommands().size()>0 && source.getPatientMedicalFileAttachmentCommands()!=null)
            source.getPatientMedicalFileAttachmentCommands().forEach(patientMedicalFileAttachmentCommand ->
                    patients.getPatientsMedicalFileAttachments().add(
                            fileAttachementCommandToFileAttachment.convert(patientMedicalFileAttachmentCommand)
                    ));


        if(source.getPatientMedicalHistoryCommands().size()>0 && source.getPatientMedicalHistoryCommands()!=null)
            source.getPatientMedicalHistoryCommands().forEach(patientMedicalHistoryCommand ->
                    patients.getPatientsMedicalHistories().add(
                            medicalHistoryCommandToMedicalHistory.convert(patientMedicalHistoryCommand)
                    ));
        return patients;
    }
}
