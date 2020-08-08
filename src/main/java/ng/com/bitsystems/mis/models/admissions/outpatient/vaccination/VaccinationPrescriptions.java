package ng.com.bitsystems.mis.models.admissions.outpatient.vaccination;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.Prescription;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VaccinationPrescriptions extends Prescription {

     @OneToOne
     private VaccinationTransactionsDetails vaccinationTransactionsDetails;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "vaccinationPrescriptionSchedule")
     private Set<VaccinationPrescriptionGeneratedAdmin> vaccinationPrescriptionGeneratedAdminTimes = new HashSet<>();
}


