package ng.com.bitsystems.mis.models.inventory;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.laboratories.RadiologyInvestigations;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InventoryPerRadiologyTransactions  extends BaseEntity {

     private Integer id;
     private Inventory inventory;
     private RadiologyInvestigations radiologyInvestigations;
     private Integer inventoryQty;

}
