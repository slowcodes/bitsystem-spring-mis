package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientCommand;
import ng.com.bitsystems.mis.converters.accounts.OtherServiceToOtherServiceCommand;
import ng.com.bitsystems.mis.converters.accounts.payment.BloodBankDonationPaymentToBloodBankDonationPaymentCommad;
import ng.com.bitsystems.mis.converters.accounts.payment.LaboratoryTransactionPaymentToLaboratoryTransactionPaymentCommand;
import ng.com.bitsystems.mis.converters.accounts.payment.PharmacyTransactionPaymentToPharmacyTransactionPaymentCommand;
import ng.com.bitsystems.mis.converters.accounts.payment.VaccinationTransactionPaymentToVaccinationTransactionPaymentCommand;
import ng.com.bitsystems.mis.converters.addmission.inpatient.InpatientAdmToInpatientAdmCmd;
import ng.com.bitsystems.mis.converters.addmission.outpatient.OutpatientAdmissionToOutpatientAdmissionCommand;
import ng.com.bitsystems.mis.converters.consultation.BookConsultationToBookConsultationCommand;
import ng.com.bitsystems.mis.converters.consultation.ClerkToClerkCommand;
import ng.com.bitsystems.mis.converters.invoice.InvoiceToInvoiceCommand;
import ng.com.bitsystems.mis.converters.laboratory.bloodbank.IssueLogToIssueLogCommand;
import ng.com.bitsystems.mis.converters.reward.loyalty.LoyaltyActivityToLoyaltyActivityCommand;
import ng.com.bitsystems.mis.converters.reward.loyalty.LoyaltyGainToLoyaltyGainCommand;
import ng.com.bitsystems.mis.converters.reward.promo.ReceivedLogToReceivedLogCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnToLabTxnCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank.BBTxnToBBTxnCommand;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.PharmSaleTxnToPharmSalesTxnCommand;
import ng.com.bitsystems.mis.converters.transaction.vaccination.VaccTxnToVaccTxnCommand;
import ng.com.bitsystems.mis.converters.user.AccountHolderToAccountHolderCommand;
import ng.com.bitsystems.mis.converters.user.StateToStateCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class PatientToPatientCommand implements Converter<Patients, PatientCommand> {
    private StateToStateCommand stateToStateCommand;
    private AccountHolderToAccountHolderCommand accountHolderToAccountHolderCommand;
    private BBTxnToBBTxnCommand bbTxnToBBTxnCommand;
    private PharmSaleTxnToPharmSalesTxnCommand pharmSaleTxnToPharmSalesTxnCommand;
    private OtherServiceToOtherServiceCommand otherServiceToOtherServiceCommand;
    private LabTxnToLabTxnCommand labTxnToLabTxnCommand;
    private InpatientAdmToInpatientAdmCmd inpatientAdmToInpatientAdmCmd;
    private OutpatientAdmissionToOutpatientAdmissionCommand outpatientAdmissionToOutpatientAdmissionCommand;
    private BookConsultationToBookConsultationCommand bookConsultationToBookConsultationCommand;
    private IssueLogToIssueLogCommand issueLogToIssueLogCommand;
    private MedicalHistoryToMedicalHistoryCommand medicalHistoryToMedicalHistoryCommand;
    private SocialHistoryToSocialHistoryCommand socialHistoryToSocialHistoryCommand;
    private DrugAllergyToDrugAllergyCommand drugAllergyToDrugAllergyCommand;
    private PatientVitalToPatientViatalCommand patientVitalToPatientViatalCommand;
    private VaccTxnToVaccTxnCommand vaccTxnToVaccTxnCommand;
    private LaboratoryTransactionPaymentToLaboratoryTransactionPaymentCommand laboratoryTransactionPaymentToLaboratoryTransactionPaymentCommand;
    private PharmacyTransactionPaymentToPharmacyTransactionPaymentCommand pharmacyTransactionPaymentToPharmacyTransactionPaymentCommand;
    private BloodBankDonationPaymentToBloodBankDonationPaymentCommad bloodBankDonationPaymentToBloodBankDonationPaymentCommad;
    private VaccinationTransactionPaymentToVaccinationTransactionPaymentCommand vaccinationTransactionPaymentToVaccinationTransactionPaymentCommand;
    private ClerkToClerkCommand clerkToClerkCommand;
    private InvoiceToInvoiceCommand invoiceToInvoiceCommand;
    private LoyaltyActivityToLoyaltyActivityCommand loyaltyActivityToLoyaltyActivityCommand;
    private LoyaltyGainToLoyaltyGainCommand loyaltyGainToLoyaltyGainCommand;
    private ReceivedLogToReceivedLogCommand receivedLogToReceivedLogCommand;
    private FileAttachmentToFileAttachementCommand fileAttachmentToFileAttachementCommand;


    @Nullable
    @Override
    public PatientCommand convert(Patients source) {

        if(source == null)
            return null;

        PatientCommand patientCommand= new PatientCommand();
        patientCommand.setAccountHolderCommand(accountHolderToAccountHolderCommand.convert(source.getAccountHolder()));
        patientCommand.setDob(source.getDob());
        patientCommand.setEmail(source.getEmail());
        patientCommand.setFirstName(source.getFirstName());
        patientCommand.setId(source.getId());
        patientCommand.setLastLoginDay(source.getLastLoginDay());
        patientCommand.setLastName(source.getLastName());
        patientCommand.setMaritalStatus(source.getMarritalStatus());
        patientCommand.setMiddleName(source.getMiddleName());
        patientCommand.setOccupation(source.getOccupation());
        patientCommand.setPhone(source.getPhone());
        patientCommand.setRegDay(source.getRegDay());
        patientCommand.setStateCommand(stateToStateCommand.convert(source.getStates()));
        patientCommand.setSex(source.getSex());
        patientCommand.setStatus(source.getStatus());

        if(source.getPatientsMedicalHistories().size()>0 && source.getPatientsMedicalHistories()!=null)
            source.getPatientsMedicalHistories().forEach(patientsMedicalHistory ->
                    patientCommand.getPatientMedicalHistoryCommands().add(
                            medicalHistoryToMedicalHistoryCommand.convert(patientsMedicalHistory)
                    ));

        if(source.getPatientsMedicalFileAttachments().size()>0 && source.getPatientsMedicalFileAttachments()!=null)
            source.getPatientsMedicalFileAttachments().forEach(fileAttachment ->
                    patientCommand.getPatientMedicalFileAttachmentCommands().add(
                            fileAttachmentToFileAttachementCommand.convert(fileAttachment)
                    ));

        if(source.getPatientDrugAllergies().size()>0 && source.getPatientDrugAllergies()!=null)
            source.getPatientDrugAllergies().forEach(patientDrugAllergy ->
                    patientCommand.getPatientDrugAllergyCommands().add(
                            drugAllergyToDrugAllergyCommand.convert(patientDrugAllergy)
                    ));

        if(source.getPatientsLoyaltyGainses().size()>0 && source.getPatientsLoyaltyGainses()!=null)
            source.getPatientsLoyaltyGainses().forEach(patientsLoyaltyGains ->
                    patientCommand.getLoyaltyGainsCommands().add(
                            loyaltyGainToLoyaltyGainCommand.convert(patientsLoyaltyGains)
                    ));

        if(source.getOutpatientAdmissions().size()>0 && source.getOutpatientAdmissions()!=null)
            source.getOutpatientAdmissions().forEach(outpatientAdmission ->
                    patientCommand.getOutpatientAdmissionCommands().add(
                            outpatientAdmissionToOutpatientAdmissionCommand.convert(outpatientAdmission)
                    ));

        if(source.getLaboratoryTransactions().size()>0 && source.getLaboratoryTransactions()!=null)
            source.getLaboratoryTransactions().forEach(laboratoryTransaction ->
                    patientCommand.getLaboratoryTransactionCommands().add(
                            labTxnToLabTxnCommand.convert(laboratoryTransaction)
                    ));

        if(source.getIssuanceLogs().size()>0 && source.getIssuanceLogs()!=null)
            source.getIssuanceLogs().forEach(issuanceLogs ->
                    patientCommand.getIssueLogCommands().add(
                            issueLogToIssueLogCommand.convert(issuanceLogs)
                    ));

        if(source.getPatientsSocialHistories().size()>0 && source.getPatientsSocialHistories()!=null)
            source.getPatientsSocialHistories().forEach(patientsSocialHistory ->
                    patientCommand.getPatientSocialHistoryCommand().add(
                            socialHistoryToSocialHistoryCommand.convert(patientsSocialHistory)
                    ));

        if(source.getPatientsVitalses().size()>0 && source.getPatientsVitalses()!=null)
            source.getPatientsVitalses().forEach(patientsVitals ->
                    patientCommand.getPatientVitalsCommands().add(
                            patientVitalToPatientViatalCommand.convert(patientsVitals)
                    ));

        if(source.getPharmacySalesTransaction().size()>0 && source.getPharmacySalesTransaction()!=null)
            source.getPharmacySalesTransaction().forEach(pharmacySalesTransaction ->
                    patientCommand.getPharmacySalesTransactionCommands().add(
                            pharmSaleTxnToPharmSalesTxnCommand.convert(pharmacySalesTransaction)
                    ));

        if(source.getVaccinationTransaction().size()>0 && source.getVaccinationTransaction()!=null)
            source.getVaccinationTransaction().forEach(vaccinationTransaction ->
                    patientCommand.getVaccinationTransactionCommands().add(
                            vaccTxnToVaccTxnCommand.convert(vaccinationTransaction)
                    ));

        if(source.getInvoices().size()>0 && source.getInvoices()!=null)
            source.getInvoices().forEach(invoice ->
                    patientCommand.getInvoiceCommands().add(
                            invoiceToInvoiceCommand.convert(invoice)
                    ));
        if(source.getInpatientAdmissions().size()>0 && source.getInpatientAdmissions()!=null)
            source.getInpatientAdmissions().forEach(inpatientAdmission ->
                    patientCommand.getInpatientAdmissionCommands().add(
                            inpatientAdmToInpatientAdmCmd.convert(inpatientAdmission)
                    ));

        if(source.getClerkings().size()>0 && source.getClerkings()!=null)
            source.getClerkings().forEach(clerks ->
                    patientCommand.getClerksCommands().add(
                            clerkToClerkCommand.convert(clerks)
                    ));

        if(source.getBookConsultations().size()>0 && source.getBookConsultations()!=null)
            source.getBookConsultations().forEach(bookConsultation ->
                    patientCommand.getBookConsultationCommands().add(
                            bookConsultationToBookConsultationCommand.convert(bookConsultation)
                    ));

        if(source.getBloodbankTransaction().size()>0 && source.getBloodbankTransaction()!=null)
            source.getBloodbankTransaction().forEach(bloodbankTransaction ->
                    patientCommand.getBloodBankTransactionCommands().add(
                            bbTxnToBBTxnCommand.convert(bloodbankTransaction)
                    ));


        return patientCommand;
    }
}
