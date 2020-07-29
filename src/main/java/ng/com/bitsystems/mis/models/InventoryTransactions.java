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
public class InventoryTransactions  extends BaseEntity {

     private Inventory inventory;
     private LaboratoryPendingSampleCollection laboratoryPendingSampleCollection;
     private Integer inventoryQty;
     private Date txnDate;

}


