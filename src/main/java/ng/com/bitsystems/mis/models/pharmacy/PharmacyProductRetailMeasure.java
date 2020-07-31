package ng.com.bitsystems.mis.models.pharmacy;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PharmacyProductRetailMeasure  extends BaseEntity {

     private String metric;
     private String mesures;
     private Set pharmacyProductses = new HashSet(0);

}


