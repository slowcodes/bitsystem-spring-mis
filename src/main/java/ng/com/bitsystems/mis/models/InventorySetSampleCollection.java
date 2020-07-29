package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InventorySetSampleCollection  extends BaseEntity {

     private Inventory inventory;
     private LaboratoryInvestigations laboratoryInvestigations;
     private Integer requiredQty;

}


