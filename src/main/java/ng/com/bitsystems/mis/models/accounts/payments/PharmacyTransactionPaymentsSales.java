package ng.com.bitsystems.mis.models.accounts.payments;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransaction;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name="pharmacy_transaction_payments")
public class PharmacyTransactionPaymentsSales extends Payments {

     @ManyToOne
     @JoinColumn(name = "pharmacytransaction_id")
     private PharmacyTransaction pharmacyTransaction;

     @JoinColumn(name="users_id")
     @ManyToOne()
     private Users users;
}


