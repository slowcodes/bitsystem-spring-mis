package ng.com.bitsystems.mis.models.transactions.vaccination;

import lombok.*;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class VaccinationTransaction extends Transaction {
    @ManyToOne
    Set<VaccinationTransactionsDetails> vaccinationTransactionsDetails = new HashSet<>();
}
