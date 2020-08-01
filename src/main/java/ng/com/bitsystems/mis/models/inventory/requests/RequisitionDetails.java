package ng.com.bitsystems.mis.models.inventory.requests;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.inventory.Inventory;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class RequisitionDetails extends BaseEntity
{
     private Inventory inventory;
     private Requisitions requisitions;
     private int reqQty;
     private String reason;
     private double estimatedCost;
     private String status;
}


