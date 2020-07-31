package ng.com.bitsystems.mis.models.vaccination;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
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
public class VaccinationTransactionsPrescriptions  extends BaseEntity {


     private PharmacyProducts pharmacyProducts;
     private Users users;
     private Date form;
     private int administrationMode;
     private int duration;
     private int frequency;
     private int dose;
     private String measure;
     private Integer vaccineTransactionId;
     private Set vaccinationPrescriptionActualAdminTimes = new HashSet(0);

}


