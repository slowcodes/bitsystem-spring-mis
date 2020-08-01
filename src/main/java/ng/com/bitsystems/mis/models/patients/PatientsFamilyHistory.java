package ng.com.bitsystems.mis.models.patients;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientsFamilyHistory  extends BaseEntity{

     private DiseaseDirectory diseaseDirectory;
     private Patients patients;
     private Users users;
     private Date dateRecorded;


}


