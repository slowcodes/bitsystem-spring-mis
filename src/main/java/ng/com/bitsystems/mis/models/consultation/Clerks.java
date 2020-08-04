package ng.com.bitsystems.mis.models.consultation;

import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;


@Getter
@Setter
@Entity
public class Clerks extends InitClinicals {

     @ManyToOne
     @JoinColumn(name = "patients_id")
     private Patients patients;

     @ManyToOne
     @JoinColumn(name ="user_id")
     private Users users;

     private LocalDate consultationDate;


}


