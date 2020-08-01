package ng.com.bitsystems.mis.models.accounts.payments;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransaction;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pharmacy_transaction_payments")
public class PharmacyTransactionPaymentsSales extends Payments {

     @ManyToOne
     private PharmacyTransaction pharmacyTransaction;

}


