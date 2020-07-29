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
public class LaboratoryInvestigationGroups  extends BaseEntity {


     private Laboratories laboratories;
     private String grpName;
     private Set laboratoryInvestigationses = new HashSet(0);

}


