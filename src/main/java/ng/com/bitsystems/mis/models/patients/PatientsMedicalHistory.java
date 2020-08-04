package ng.com.bitsystems.mis.models.patients;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientsMedicalHistory  extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "patients_id")
     private Patients patients;

     @ManyToOne
     @JoinColumn(name = "patientsmedicalactivitylisting_id")
     private PatientsMedicalActivityListing patientsMedicalActivityListing;

     @ManyToOne
     @JoinColumn(name = "users_id")
     private Users users;

     private LocalDate dateRecorded;

}


