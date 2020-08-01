package ng.com.bitsystems.mis.models.users;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Users  extends AccountHolder {

     private byte[] image;
     private Date regDay;
     private String title;
     private Set outpatientPrescriptionSchedules = new HashSet(0);
     private Set vaccinationTransactionsDetailses = new HashSet(0);
     private Set inpatientAdmissions = new HashSet(0);
     private Set patientsMedicalHistories = new HashSet(0);
     private Set accountsOtherServiceBillingsPaymentses = new HashSet(0);
     private Set bloodbankDonationClearedQueues = new HashSet(0);
     private Set accountExpenseManagersForIssueTo = new HashSet(0);
     private Set patientConsultationsClerkingses = new HashSet(0);
     private Set accountExpenseManagersForTeller = new HashSet(0);
     private Set pharmacyPromosTransactionses = new HashSet(0);
     private Set laboratoryInvoiceDetailses = new HashSet(0);
     private Set radiologyInvoiceTransactionDetailses = new HashSet(0);
     private Set inpatientPrescriptionSchedules = new HashSet(0);
     private Set patientsFamilyHistories = new HashSet(0);
     private Set patientsSocialHistories = new HashSet(0);
     private Set bloodbankDonorDonateds = new HashSet(0);
     private Set inpatientAdmissionDischargeds = new HashSet(0);
     private Set radiologyInvestigationResultVerifieds = new HashSet(0);
     private Set radiologyTransactionDetailses = new HashSet(0);
     private Set pharmacyTransactionPaymentsSaleses = new HashSet(0);
     private Set bloodbankDonorBleedingSchedules = new HashSet(0);
     private Set vaccinationPrescriptionActualAdminTimes = new HashSet(0);
     private Set vaccinationTransactionsPrescriptionses = new HashSet(0);
     private Set inpatientPharmacyPrescriptionses = new HashSet(0);
     private Set laboratoryInvestigationResultVerifieds = new HashSet(0);
     private Set usersPrivileges = new HashSet(0);
     private Set bloodbankDonotionQueues = new HashSet(0);
     private Set outpatientAdmissions = new HashSet(0);
     private Set outpatientPrescriptionActualAdminTimes = new HashSet(0);
     private Set pharmacyPromosProductses = new HashSet(0);
     private Set bloodbankTransactionDetailses = new HashSet(0);
     private Set laboratoryTransactionDetailses = new HashSet(0);
     private Set patientConsultationDiseaseDirectories = new HashSet(0);
     private Set requisitionses = new HashSet(0);
     private Set pharmacyTransactionDetailsSaleses = new HashSet(0);
     private Set laboratoryCollectedSampleses = new HashSet(0);
     private Set patientsConsultationAppointments = new HashSet(0);
     private Set inpatientPrescriptionActualAdminTimes = new HashSet(0);
     private Set vaccinationPrescriptionSchedules = new HashSet(0);
     private Set bloodbankDonationPaymentses = new HashSet(0);
     private Set outpatientAdmissionDischargeds = new HashSet(0);
     private Set laboratoryTransactionPaymentses = new HashSet(0);
     private Set laboratoryInvestigationResultCollectionLogses = new HashSet(0);
     private Set bloodbloodDonorIssuanceLogses = new HashSet(0);


}


