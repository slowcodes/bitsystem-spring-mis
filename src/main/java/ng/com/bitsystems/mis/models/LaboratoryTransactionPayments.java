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
public class LaboratoryTransactionPayments  extends BaseEntity {


     private Integer paymentId;
     private Users users;
     private String transactionId;
     private String paymentMethod;
     private Double amountPaid;
     private Date payDay;
     private Date paymentDate;

}


