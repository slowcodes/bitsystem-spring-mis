package ng.com.bitsystems.mis.models.inventory.requests;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.inventory.Inventory;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class RequisitionDetails extends BaseEntity
{
     @ManyToOne
     @JoinColumn(name="inventory_id")
     private Inventory inventory;

     @ManyToOne
     @JoinColumn(name="requisitions_id")
     private Requisitions requisitions;

     private Integer reqQty;
     private String reason;
     private Double estimatedCost;
     private String status;
}


