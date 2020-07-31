package ng.com.bitsystems.mis.models.transactions.pharmacy;

import lombok.*;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class SupplyTransactions extends Transaction {

    Set<PharmacyTransactionsSupplies> pharmacyTransactionsSupplies = new HashSet<>();
}
