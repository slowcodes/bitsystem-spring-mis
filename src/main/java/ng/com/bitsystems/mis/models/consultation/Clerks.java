package ng.com.bitsystems.mis.models.consultation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.MappedSuperclass;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Clerks extends InitClinicals {

     private Patients patients;
     private Users users;
     private Date consultationDate;
     private Set patientConsultationClerkingSymptomses = new HashSet(0);

}


