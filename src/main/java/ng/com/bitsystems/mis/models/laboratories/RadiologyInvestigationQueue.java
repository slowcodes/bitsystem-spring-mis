package ng.com.bitsystems.mis.models.laboratories;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

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
public class RadiologyInvestigationQueue  extends BaseEntity {


     private ng.com.bitsystems.mis.models.laboratories.RadiologyTransactions radiologyTransactions;
     private Integer samplePackage;
     private Date scheduledTime;
     private Integer investigationStatus;
     private Set radiologyInvestigationResultSummaries = new HashSet(0);


}


