package ng.com.bitsystems.mis.models.vaccination;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class VaccinationPrescriptionActualAdminTime  extends BaseEntity {


     private Integer id;
     private Users users;
     private VaccinationTransactionsPrescriptions vaccinationTransactionsPrescriptions;
     private Date administrationTime;
     private String commentObservation;



}


