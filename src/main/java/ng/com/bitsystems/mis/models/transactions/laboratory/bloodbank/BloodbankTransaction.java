package ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredBloodbankTransactions;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BloodbankTransaction extends Transaction {

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "bloodbanktransaction")
     private Set <BloodbankTransactionDetails> bloodbankTransactionDetails = new HashSet<>();

     @OneToOne(cascade = CascadeType.ALL)
     private InsuredBloodbankTransactions insuredBloodbankTransactions;

}


