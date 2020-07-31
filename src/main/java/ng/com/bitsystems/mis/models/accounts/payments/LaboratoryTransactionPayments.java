package ng.com.bitsystems.mis.models.accounts.payments;


import lombok.*;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LaboratoryTransactionPayments  extends Payments {

     private LaboratoryTransaction laboratoryTransaction;

}


