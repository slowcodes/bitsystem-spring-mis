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
public class Packages  extends BaseEntity {


     private String packageName;
     private String packageType;
     private Double discount;
     private String packageDesc;
     private Set packageDetailses = new HashSet(0);

}


