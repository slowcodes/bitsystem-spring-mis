package ng.com.bitsystems.mis.models.vaccination;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


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
public class VaccinationTransactionsPayments  extends BaseEntity {

     private int transactionId;
     private String paymentMethod;
     private double amountPaid;
     private Integer processedBy;
     private Date dateOfPayment;
     private Date timeOfPayment;
     private String comment;

}


