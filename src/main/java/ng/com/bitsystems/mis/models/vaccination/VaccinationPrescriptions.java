package ng.com.bitsystems.mis.models.vaccination;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.Prescription;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VaccinationPrescriptions extends Prescription {

     private VaccinationTransactionsDetails vaccinationTransactionsDetails;
     private Set vaccinationPrescriptionActualAdminTimes = new HashSet(0);

}


