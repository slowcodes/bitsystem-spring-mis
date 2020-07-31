package ng.com.bitsystems.mis.models.requests;


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Requisitions  extends BaseEntity
{
     private int reqQty;
     private String reason;
     private double estimatedCost;
     private Date dateOfRequest;
     private String status;
     private String otherItem;

}


