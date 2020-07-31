package ng.com.bitsystems.mis.models.laboratories;


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class RadialogyInvestigationGroups  extends BaseEntity {

     private Laboratories laboratories;
     private String grpName;
     private int description;

}


