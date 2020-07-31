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
public class LaboratoryInvestigations  extends Investigations {

     private Laboratories laboratories;
     private LaboratoryInvestigationGroups laboratoryInvestigationGroups;
     private Set inventoryPerLaboratoryTransactions = new HashSet(0);
     private Set laboratoryPackageDetailses = new HashSet(0);
     private Set laboratoryInvestigationResultParameterses = new HashSet(0);

}


