package ng.com.bitsystems.mis.models.vaccination;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class VaccinationPrescriptionGeneratedAdminTime  extends BaseEntity {

     private VaccinationPrescriptionSchedule vaccinationPrescriptionSchedule;
     private Integer extimatedAdminTime;


}


