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
public class DiseaseDirectory  extends BaseEntity {

     private Users users;
     private String disease;
     private String description;
     private Set patientsFamilySocialHistories = new HashSet(0);

}


