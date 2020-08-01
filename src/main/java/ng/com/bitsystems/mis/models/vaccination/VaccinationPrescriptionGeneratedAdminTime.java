package ng.com.bitsystems.mis.models.vaccination;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.GeneratedAdministration;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VaccinationPrescriptionGeneratedAdminTime  extends GeneratedAdministration {

     private VaccinationPrescriptionSchedule vaccinationPrescriptionSchedule;

}


