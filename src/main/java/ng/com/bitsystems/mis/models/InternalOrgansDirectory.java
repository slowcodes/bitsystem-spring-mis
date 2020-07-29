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
public class InternalOrgansDirectory  extends BaseEntity {

     private String system;
     private Set clerksSystemReviews = new HashSet(0);

}


