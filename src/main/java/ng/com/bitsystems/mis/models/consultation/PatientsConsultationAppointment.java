package ng.com.bitsystems.mis.models.consultation;


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PatientsConsultationAppointment  extends BaseEntity {

     private Patients patients;
     private Users users;
     private Date dateBooked;
     private String status;
     private String professional;
     private Date preferedMeetingTime;

}


