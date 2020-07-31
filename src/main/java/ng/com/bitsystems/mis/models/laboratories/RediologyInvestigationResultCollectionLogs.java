package ng.com.bitsystems.mis.models.laboratories;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class RediologyInvestigationResultCollectionLogs  extends BaseEntity {

     private Date timeOfCollection;
     private int resultId;
     private String issuedBy;

}


