package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Requisitions  extends BaseEntity {

     private Users users;
     private String requestType;
     private String tmpTransactionCode;
     private int linkId;
     private int reqQty;
     private String reason;
     private double estimatedCost;
     private Date dateOfRequest;
     private String status;
     private String otherItem;

}


