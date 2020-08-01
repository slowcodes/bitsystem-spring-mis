package ng.com.bitsystems.mis.models.patients;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientsSocialHistory  extends BaseEntity {

     private PatientSocioCulturalHistoryDirectory patientSocioCulturalHistoryDirectory;
     private Patients patients;
     private Users users;
     private Date dateRecorded;

}


