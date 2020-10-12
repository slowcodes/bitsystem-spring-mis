package ng.com.bitsystems.mis.models.vaccination;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VaccineSchedule extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "VaccinationTransactionDetails_id")
     private VaccinationTransactionsDetails vaccinationTransactionDetails;

     @ManyToOne
     @JoinColumn(name="vaccine_id")
     private Vaccines vaccines;
}


