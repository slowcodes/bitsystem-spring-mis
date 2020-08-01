package ng.com.bitsystems.mis.models.transactions.bloodbank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BloodbankTransaction extends Transaction {

     private Set bloodbankTransactionses = new HashSet(0);
     private Set insuranceBloodbankTransactions = new HashSet(0);

}


