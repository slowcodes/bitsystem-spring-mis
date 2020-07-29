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
public class Inventory  extends BaseEntity {

     private InventoryGroups inventoryGroups;
     private PricingCode pricingCode;
     private String name;
     private String itemDesc;
     private String measure;
     private int qtyAvl;
     private String itemType;
     private Set inventoryTransactionses = new HashSet(0);
     private Set inventoryBarcodeses = new HashSet(0);
     private Set inventorySetSampleCollections = new HashSet(0);

}


