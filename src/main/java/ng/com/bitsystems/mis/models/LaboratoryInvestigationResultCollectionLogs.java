package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LaboratoryInvestigationResultCollectionLogs  extends BaseEntity {


     private LaboratoryInvestigationResultSummary laboratoryInvestigationResultSummary;
     private Users users;
     private Date timeOfCollection;


}


