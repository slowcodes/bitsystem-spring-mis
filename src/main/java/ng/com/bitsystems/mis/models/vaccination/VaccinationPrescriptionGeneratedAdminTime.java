package ng.com.bitsystems.mis.models.vaccination;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.pharmacy.GeneratedAdministration;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class VaccinationPrescriptionGeneratedAdminTime  extends GeneratedAdministration {

     private VaccinationPrescriptionSchedule vaccinationPrescriptionSchedule;

}


