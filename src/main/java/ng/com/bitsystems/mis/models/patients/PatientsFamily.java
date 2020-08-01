package ng.com.bitsystems.mis.models.patients;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientsFamily  extends BaseEntity {

     private String familyName;
     private String phone;
     private String email;
     private Date dateRegistered;
     private Set patientses = new HashSet(0);

}


