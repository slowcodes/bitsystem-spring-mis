package ng.com.bitsystems.mis.models.transactions.vaccination;

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
public class VaccinationTransaction extends Transaction {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vaccinationTransaction")
    Set<VaccinationTransactionsDetails> vaccinationTransactionsDetails = new HashSet<>();

    public VaccinationTransaction addTxnDetail(VaccinationTransactionsDetails transactions) {
        this.vaccinationTransactionsDetails.add(transactions);
        transactions.setVaccinationTransaction(this);
        return this;
    }
}
