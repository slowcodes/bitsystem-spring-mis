package ng.com.bitsystems.mis.models.accounts.payments;


import lombok.*;
import ng.com.bitsystems.mis.models.transactions.LaboratoryTransactionDetails;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LaboratoryTransactionPayments  extends Payments {

     private LaboratoryTransactionDetails laboratoryTransactionDetails;

}


