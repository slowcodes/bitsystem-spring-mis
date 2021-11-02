package ng.com.bitsystems.mis.converters.patient;

import ng.com.bitsystems.mis.command.patients.PatientCommand;
import ng.com.bitsystems.mis.converters.addmission.AdmissionToAdmissionCommand;
import ng.com.bitsystems.mis.converters.consultation.BookConsultationToBookConsultationCommand;
import ng.com.bitsystems.mis.converters.consultation.ClerkToClerkCommand;
import ng.com.bitsystems.mis.converters.invoice.InvoiceToInvoiceCommand;
import ng.com.bitsystems.mis.converters.laboratory.bloodbank.IssueLogToIssueLogCommand;
import ng.com.bitsystems.mis.converters.reward.loyalty.LoyaltyActivityToLoyaltyActivityCommand;
import ng.com.bitsystems.mis.converters.reward.loyalty.LoyaltyGainToLoyaltyGainCommand;
import ng.com.bitsystems.mis.converters.reward.promo.ReceivedLogToReceivedLogCommand;
import ng.com.bitsystems.mis.converters.user.AccountHolderToAccountHolderCommand;
import ng.com.bitsystems.mis.converters.user.StateToStateCommand;
import ng.com.bitsystems.mis.models.patients.Patients;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class PatientToPatientCommand implements Converter<Patients, PatientCommand> {
    private StateToStateCommand stateToStateCommand;
    private AccountHolderToAccountHolderCommand accountHolderToAccountHolderCommand;
    private AdmissionToAdmissionCommand inpatientAdmToInpatientAdmCmd;
    private BookConsultationToBookConsultationCommand bookConsultationToBookConsultationCommand;
    private IssueLogToIssueLogCommand issueLogToIssueLogCommand;
    private MedicalHistoryToMedicalHistoryCommand medicalHistoryToMedicalHistoryCommand;
    private DrugAllergyToDrugAllergyCommand drugAllergyToDrugAllergyCommand;
    private PatientVitalToPatientViatalCommand patientVitalToPatientViatalCommand;
    private ClerkToClerkCommand clerkToClerkCommand;
    private InvoiceToInvoiceCommand invoiceToInvoiceCommand;
    private LoyaltyActivityToLoyaltyActivityCommand loyaltyActivityToLoyaltyActivityCommand;
    private LoyaltyGainToLoyaltyGainCommand loyaltyGainToLoyaltyGainCommand;
    private ReceivedLogToReceivedLogCommand receivedLogToReceivedLogCommand;


    @Nullable
    @Override
    public PatientCommand convert(Patients source) {

        if(source == null)
            return null;

        PatientCommand patientCommand= new PatientCommand();
        //patientCommand.setAccountHolderCommand(accountHolderToAccountHolderCommand.convert(source.getAccountHolder()));
        patientCommand.setDob(source.getDob());
        patientCommand.setEmail(source.getEmail());
        patientCommand.setFirstName(source.getFirstName());
        patientCommand.setId(source.getId());
        //patientCommand.setLastLoginDay(source.getLastLoginDay());
        patientCommand.setLastName(source.getLastName());
        patientCommand.setMaritalStatus(source.getMarritalStatus());
        patientCommand.setMiddleName(source.getMiddleName());
        patientCommand.setOccupation(source.getOccupation());
        patientCommand.setPhone(source.getPhone());
        //patientCommand.setRegDay(source.getRegDay());
        if(source.getStates()!=null)
            //patientCommand.setStateCommand(stateToStateCommand.convert(source.getStates()));
        patientCommand.setSex(source.getSex());
        patientCommand.setStatus(source.getStatus());

        if(source.getPatientsMedicalHistories().size()>0 && source.getPatientsMedicalHistories()!=null)
            source.getPatientsMedicalHistories().forEach(patientsMedicalHistory ->
                    patientCommand.getPatientMedicalHistoryCommands().add(
                            medicalHistoryToMedicalHistoryCommand.convert(patientsMedicalHistory)
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


        if(source.getPatientsVitalses().size()>0 && source.getPatientsVitalses()!=null)
            source.getPatientsVitalses().forEach(patientsVitals ->
                    patientCommand.getPatientVitalsCommands().add(
                            patientVitalToPatientViatalCommand.convert(patientsVitals)
                    ));

//        if(source.getVaccinationTransaction().size()>0 && source.getVaccinationTransaction()!=null)
//            source.getVaccinationTransaction().forEach(vaccinationTransaction ->
//                    patientCommand.getVaccinationTransactionCommands().add(
//                            vaccTxnToVaccTxnCommand.convert(vaccinationTransaction)
//                    ));

        if(source.getInvoices().size()>0 && source.getInvoices()!=null)
            source.getInvoices().forEach(invoice ->
                    patientCommand.getInvoiceCommands().add(
                            invoiceToInvoiceCommand.convert(invoice)
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




        return patientCommand;
    }
}
