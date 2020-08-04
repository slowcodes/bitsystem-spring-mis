package ng.com.bitsystems.mis.models.transactions.vaccination;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.referrals.Referrals;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.*;
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

    @ManyToOne
    @JoinColumn(name = "refferals_id")
    private Referrals referral;
}
