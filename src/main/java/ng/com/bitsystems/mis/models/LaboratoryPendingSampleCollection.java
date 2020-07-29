package ng.com.bitsystems.mis.models;

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
public class LaboratoryPendingSampleCollection  extends BaseEntity {


     private LaboratoryTransactions laboratoryTransactions;
     private Integer samplePackage;
     private Integer collectionStatus;
     private Set inventoryTransactionses = new HashSet(0);



}


