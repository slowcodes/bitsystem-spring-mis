package ng.com.bitsystems.mis.models.inventory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Inventory  extends BaseEntity {

     @ManyToMany
     @JoinTable(name = "inventory_category",
             joinColumns = @JoinColumn(name = "inventory_id"),
             inverseJoinColumns = @JoinColumn(name = "inventorygroups_id"))
     private Set<InventoryGroups> inventoryGroups = new HashSet<>();

     @OneToOne
     private SalesPriceCode salesPriceCode;

     private String name;
     private String itemDesc;
     private String measure;
     private int qtyAvl;
     private String itemType;

     @OneToMany
     private Set<InventoryBarcodes> inventoryBarcodes = new HashSet<>();

     @OneToMany
     private Set<InventoryPerLaboratoryTransaction> inventoryPerLaboratoryTransactions=new HashSet<>();

    public Inventory addBarcodes(InventoryBarcodes inventoryBarcodes) {
         this.inventoryBarcodes.add(inventoryBarcodes);
         inventoryBarcodes.setInventory(this);
         return this;
    }

     public Inventory addInventoryPerTransaction(InventoryPerLaboratoryTransaction inventoryPerLaboratoryTransaction) {
        this.inventoryPerLaboratoryTransactions.add(inventoryPerLaboratoryTransaction);
        inventoryPerLaboratoryTransaction.setInventory(this);
        return this;
     }
}


