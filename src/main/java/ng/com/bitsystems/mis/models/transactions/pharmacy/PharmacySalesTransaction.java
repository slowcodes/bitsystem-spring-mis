package ng.com.bitsystems.mis.models.transactions.pharmacy;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PharmacySalesTransaction extends Transaction {
     @OneToMany(cascade = CascadeType.ALL, mappedBy = "pharmacySalesTransaction")
     private Set<PharmacyTransactionDetails> pharmacyTransactionDetails = new HashSet<>();

     public PharmacySalesTransaction addTransaction(PharmacyTransactionDetails details) {
          pharmacyTransactionDetails.add(details);
          details.setPharmacySalesTransaction(this);
          return this;
     }
}


