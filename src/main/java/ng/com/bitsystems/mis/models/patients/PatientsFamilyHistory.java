package ng.com.bitsystems.mis.models.patients;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.consultation.PatientConsultationDiseaseDirectory;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PatientsFamilyHistory  extends BaseEntity{

     private PatientConsultationDiseaseDirectory patientConsultationDiseaseDirectory;
     private Patients patients;
     private Users users;
     private Date dateRecorded;


}


