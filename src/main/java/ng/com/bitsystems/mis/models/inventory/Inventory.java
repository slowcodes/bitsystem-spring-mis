package ng.com.bitsystems.mis.models.inventory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Inventory  extends BaseEntity {

     private InventoryGroups inventoryGroups;
     private ServicePriceCode servicePriceCode;
     private String name;
     private String itemDesc;
     private String measure;
     private int qtyAvl;
     private String itemType;
     private Set inventoryPerRadiologyTransactionses = new HashSet(0);
     private Set inventoryBarcodeses = new HashSet(0);
     private Set inventoryPerLaboratoryTransactions = new HashSet(0);

}


