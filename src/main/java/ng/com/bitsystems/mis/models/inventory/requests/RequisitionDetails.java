package ng.com.bitsystems.mis.models.inventory.requests;


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.inventory.Inventory;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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


