package ng.com.bitsystems.mis.models.inventory;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InventoryBarcodes  extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "inventory_id")
     private Inventory inventory;

     private String barcode;

}


