package ng.com.bitsystems.mis.models.transactions.pharmacy;

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
public class SupplyTransactions extends Transaction {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "supplyTransactions")
    Set<PharmacyTransactionsSupplies> pharmacyTransactionsSupplies = new HashSet<>();
}
