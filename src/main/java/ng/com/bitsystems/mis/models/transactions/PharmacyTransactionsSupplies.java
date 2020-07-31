package ng.com.bitsystems.mis.models.transactions;

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
public class PharmacyTransactionsSupplies  extends BaseEntity {

     private Date transactionDate;
     private Double buyingPrice;
     private Double qty;
     private Integer productId;
     private Integer transactionId;
     private String batchNumber;
     private String comment;
     private Date expiryDate;

}


