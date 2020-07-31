package ng.com.bitsystems.mis.models.insurance;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.vaccination.VaccinationTransactionsDetails;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InsuranceVacinationTransaction  extends Insurance {
     private VaccinationTransactionsDetails vaccinationTransactionsDetails;
}


