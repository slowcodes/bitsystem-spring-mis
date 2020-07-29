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
public class InventoryGroups  extends BaseEntity {

     private String groupName;
     private String groupDesc;
     private Set inventories = new HashSet(0);

}


