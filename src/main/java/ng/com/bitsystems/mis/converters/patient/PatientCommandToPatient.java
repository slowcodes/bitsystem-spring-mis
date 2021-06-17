package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientCommand;
import ng.com.bitsystems.mis.converters.addmission.AdmissionCommandToAdmission;
import ng.com.bitsystems.mis.converters.consultation.BookConsultationCommandToBookConsultation;
import ng.com.bitsystems.mis.converters.consultation.ClerkCommandToClerk;
import ng.com.bitsystems.mis.converters.invoice.InvoiceCommandToInvoice;
import ng.com.bitsystems.mis.converters.laboratory.bloodbank.IssueLogCommandToIssueLog;
import ng.com.bitsystems.mis.converters.reward.loyalty.LoyaltyActivityCommandToLoyaltyActivity;
import ng.com.bitsystems.mis.converters.reward.loyalty.LoyaltyGainCommandToLoyaltyGain;
import ng.com.bitsystems.mis.converters.reward.promo.ReceivedLogCommandToReceivedLog;
import ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank.BBTxnCommandToBBTxn;
import ng.com.bitsystems.mis.converters.transaction.vaccination.VaccTxnCommandToVaccTxn;
import ng.com.bitsystems.mis.converters.user.AccountHolderCommandToAccountHolder;
import ng.com.bitsystems.mis.converters.user.StateCommandToState;
import ng.com.bitsystems.mis.models.patients.Patients;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class PatientCommandToPatient implements Converter<PatientCommand, Patients> {
    private StateCommandToState stateCommandToState;
    private BookConsultationCommandToBookConsultation bookConsultationCommandToBookConsultatio;
    private IssueLogCommandToIssueLog issueLogCommandToIssueLog;
    private MedicalHistoryCommandToMedicalHistory medicalHistoryCommandToMedicalHistory;
    private SocialHistoryCommandToSocialHistory socialHistoryCommandToSocialHistory;
    private DrugAllergyCommandToDrugAllergy drugAllergyCommandToDrugAllergy;
    private PatientVitalCommandToPatientVital patientVitalCommandToPatientVital;
    private ClerkCommandToClerk clerkCommandToClerk;
    private InvoiceCommandToInvoice invoiceToInvoiceCommand;
    private LoyaltyActivityCommandToLoyaltyActivity loyaltyActivityCommandToLoyaltyActivity;
    private LoyaltyGainCommandToLoyaltyGain loyaltyGainCommandToLoyaltyGain;
    private ReceivedLogCommandToReceivedLog receivedLogCommandToReceivedLog;
    private FileAttachementCommandToFileAttachment fileAttachementCommandToFileAttachment;

    public PatientCommandToPatient(StateCommandToState stateCommandToState,
                                   AccountHolderCommandToAccountHolder accountHolderCommandToAccountHolder,
                                   BBTxnCommandToBBTxn bbTxnCommandToBBTxn,
                                   AdmissionCommandToAdmission admissionCommandToAdmission,
                                   BookConsultationCommandToBookConsultation bookConsultationCommandToBookConsultatio,
                                   IssueLogCommandToIssueLog issueLogCommandToIssueLog,
                                   MedicalHistoryCommandToMedicalHistory medicalHistoryCommandToMedicalHistory,
                                   SocialHistoryCommandToSocialHistory socialHistoryCommandToSocialHistory,
                                   DrugAllergyCommandToDrugAllergy drugAllergyCommandToDrugAllergy,
                                   PatientVitalCommandToPatientVital patientVitalCommandToPatientVital,
                                   VaccTxnCommandToVaccTxn vaccTxnCommandToVaccTxn,

                                   ClerkCommandToClerk clerkCommandToClerk, InvoiceCommandToInvoice invoiceToInvoiceCommand, LoyaltyActivityCommandToLoyaltyActivity loyaltyActivityCommandToLoyaltyActivity, LoyaltyGainCommandToLoyaltyGain loyaltyGainCommandToLoyaltyGain, ReceivedLogCommandToReceivedLog receivedLogCommandToReceivedLog, FileAttachementCommandToFileAttachment fileAttachementCommandToFileAttachment) {
        this.stateCommandToState = stateCommandToState;


        this.bookConsultationCommandToBookConsultatio = bookConsultationCommandToBookConsultatio;
        this.issueLogCommandToIssueLog = issueLogCommandToIssueLog;
        this.medicalHistoryCommandToMedicalHistory = medicalHistoryCommandToMedicalHistory;
        this.socialHistoryCommandToSocialHistory = socialHistoryCommandToSocialHistory;
        this.drugAllergyCommandToDrugAllergy = drugAllergyCommandToDrugAllergy;
        this.patientVitalCommandToPatientVital = patientVitalCommandToPatientVital;
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
        //patients.setRegDay(source.getRegDay());
        patients.setSex(source.getSex());
        patients.setPhone(source.getPhone());
        patients.setMiddleName(source.getMiddleName());
        patients.setFirstName(source.getFirstName());
        patients.setLastName(source.getLastName());
        //patients.setLastLoginDay(source.getLastLoginDay());
        patients.setEmail(source.getEmail());
        patients.setStates(stateCommandToState.convert(source.getStateCommand()));
        //patients.setAccountHolder(accountHolderCommandToAccountHolder.convert(source.getAccountHolderCommand()));
        patients.setDob(source.getDob());



        if(source.getBookConsultationCommands().size()>0 && source.getBookConsultationCommands()!=null)
            source.getBookConsultationCommands().forEach(bookConsultationCommand ->
                    patients.getBookConsultations().add(bookConsultationCommandToBookConsultatio.convert(bookConsultationCommand)));

        if(source.getClerksCommands().size()>0 && source.getClerksCommands()!=null)
            source.getClerksCommands().forEach(clerksCommand ->
                    patients.getClerkings().add(clerkCommandToClerk.convert(clerksCommand)));


        if(source.getInvoiceCommands().size()>0 && source.getInvoiceCommands()!=null)
            source.getInvoiceCommands().forEach(invoiceCommand ->
                    patients.getInvoices().add(
                            invoiceToInvoiceCommand.convert(invoiceCommand)
                    ));

//        if(source.getVaccinationTransactionCommands().size()>0 && source.getVaccinationTransactionCommands()!=null)
//            source.getVaccinationTransactionCommands().forEach(vaccinationTransactionCommand ->
//                    patients.getVaccinationTransaction().add(vaccTxnCommandToVaccTxn.convert(vaccinationTransactionCommand)));
//


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



        if(source.getLoyaltyGainsCommands().size()>0 && source.getLoyaltyGainsCommands()!=null)
            source.getLoyaltyGainsCommands().forEach(loyaltyGainsCommand ->
                    patients.getPatientsLoyaltyGainses().add(loyaltyGainCommandToLoyaltyGain.convert(
                            loyaltyGainsCommand
                    )));


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
