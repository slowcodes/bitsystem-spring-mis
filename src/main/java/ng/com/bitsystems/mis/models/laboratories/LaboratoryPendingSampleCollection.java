package ng.com.bitsystems.mis.models.laboratories;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.LaboratoryTransactions;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LaboratoryPendingSampleCollection  extends BaseEntity {

     private LaboratoryTransactions laboratoryTransactions;
     private Integer samplePackage;
     private Date timeOfCollection;
     private Integer collectionStatus;

}


