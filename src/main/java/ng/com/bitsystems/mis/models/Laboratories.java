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
public class Laboratories  extends BaseEntity{

     private String labName;
     private String description;
     private Set laboratoryInvestigationGroupses = new HashSet(0);

}


