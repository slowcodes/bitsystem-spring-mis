package ng.com.bitsystems.mis.models.admissions.outpatient.vaccination;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.Drugs;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;

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
public class Vaccinations  extends Drugs {

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "vaccinations")
     private Set<VaccinationTransactionsDetails> vaccinationTransactionsDetails = new HashSet<>();
}


