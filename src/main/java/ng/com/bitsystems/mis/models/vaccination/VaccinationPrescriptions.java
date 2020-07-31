package ng.com.bitsystems.mis.models.vaccination;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.pharmacy.Prescription;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class VaccinationPrescriptions extends Prescription {

     private VaccinationTransactionsDetails vaccinationTransactionsDetails;
     private Set vaccinationPrescriptionActualAdminTimes = new HashSet(0);

}


