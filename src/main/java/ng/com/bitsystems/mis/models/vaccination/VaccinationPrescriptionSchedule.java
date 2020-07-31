package ng.com.bitsystems.mis.models.vaccination;


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class VaccinationPrescriptionSchedule  extends BaseEntity {

     private Users users;
     private VaccinationPrescriptionSchedule vaccinationPrescriptionSchedule;
     private int noOfDosage;
     private Integer hourlyInterval;
     private Integer timeOfSchedule;
     private Set vaccinationPrescriptionGeneratedAdminTimes = new HashSet(0);
     private Set vaccinationPrescriptionSchedules = new HashSet(0);

}


