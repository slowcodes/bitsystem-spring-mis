package ng.com.bitsystems.mis.models.accounts.payments;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LaboratoryTransactionPayments  extends Payments {

     @ManyToOne
     private LaboratoryTransaction laboratoryTransaction;

}


