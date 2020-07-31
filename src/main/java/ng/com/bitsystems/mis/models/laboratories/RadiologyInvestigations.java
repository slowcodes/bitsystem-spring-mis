package ng.com.bitsystems.mis.models.laboratories;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class RadiologyInvestigations  extends Investigations {

     private Set radiologyTransactionses = new HashSet(0);
     private Set inventoryPerRadiologyTransactionses = new HashSet(0);
}


