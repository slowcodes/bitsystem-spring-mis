package ng.com.bitsystems.mis.models.accounts.payments;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LaboratoryTransactionPayments  extends Payments {

     @ManyToOne
     @JoinColumn(name = "laboratorytransaction_id")
     private LaboratoryTransaction laboratoryTransaction;

     @JoinColumn(name="users_id")
     @ManyToOne()
     private Users users;

}


