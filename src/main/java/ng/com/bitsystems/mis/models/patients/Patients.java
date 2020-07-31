package ng.com.bitsystems.mis.models.patients;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.users.AccountHolder;
import ng.com.bitsystems.mis.models.users.States;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Patients  extends AccountHolder {

     private PatientsFamily patientsFamily;
     private States states;
     private String firstName;
     private String lastName;
     private String phone;
     private Date regDay;
     private String address;
     private String sex;
     private String email;
     private Date dob;
     private String occupation;
     private String marritalStatus;
     private byte[] photo;
     private Set patientsConsultationAppointments = new HashSet(0);
     private Set patientsReferralsesForReferredPatient = new HashSet(0);
     private Set patientsSocialHistories = new HashSet(0);
     private Set patientsMedicalHistories = new HashSet(0);
     private Set patientsReferralsesForReferringPatient = new HashSet(0);
     private Set pharmacyTransactionDetailsSaleses = new HashSet(0);
     private Set radiologyInvoiceTransactionDetailses = new HashSet(0);
     private Set radiologyTransactionDetailses = new HashSet(0);
     private Set laboratoryTransactionDetailses = new HashSet(0);
     private Set patientsFamilyHistories = new HashSet(0);
     private Set bloodbloodDonorIssuanceLogses = new HashSet(0);
     private Set inpatientAdmissions = new HashSet(0);
     private Set outpatientAdmissions = new HashSet(0);
     private Set patientsMedicalFileAttachments = new HashSet(0);
     private Set bloodbankDonorRegistries = new HashSet(0);
     private Set patientsLoyaltyGainses = new HashSet(0);
     private Set patientConsultationsClerkingses = new HashSet(0);
     private Set bloodbankTransactionDetailses = new HashSet(0);
     private Set patientDrugAllergies = new HashSet(0);
     private Set patientsVitalses = new HashSet(0);
     private Set laboratoryInvoiceDetailses = new HashSet(0);
     private Set vaccinationTransactionsDetailses = new HashSet(0);

}


