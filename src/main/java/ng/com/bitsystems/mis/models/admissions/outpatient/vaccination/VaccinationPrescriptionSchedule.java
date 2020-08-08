package ng.com.bitsystems.mis.models.admissions.outpatient.vaccination;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.PrescriptionSchedule;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VaccinationPrescriptionSchedule  extends PrescriptionSchedule {

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "vaccinationPrescriptionSchedule")
     private Set<VaccinationPrescriptionGeneratedAdmin> vaccinationPrescriptionGeneratedAdminTimes = new HashSet<>();

}


