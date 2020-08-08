package ng.com.bitsystems.mis.models.transactions.vaccination;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.admissions.outpatient.vaccination.VaccinationPrescriptions;
import ng.com.bitsystems.mis.models.admissions.outpatient.vaccination.Vaccinations;
import ng.com.bitsystems.mis.models.transactions.Service;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VaccinationTransactionsDetails extends Service {

     @ManyToOne()
     @JoinColumn(name = "vaccinationtransaction_id")
     VaccinationTransaction vaccinationTransaction;

     @ManyToOne
     @JoinColumn(name = "vaccinations_id")
     Vaccinations vaccinations;

     @OneToOne
     VaccinationPrescriptions vaccinationPrescriptions;
}


