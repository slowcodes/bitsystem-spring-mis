package ng.com.bitsystems.mis.models.transactions.vaccination;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.patients.Patients;
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
public class VaccinationTransaction extends BaseEntity {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vaccinationTransaction")
    Set<VaccinationTransactionsDetails> vaccinationTransactionsDetails = new HashSet<>();

    @OneToOne
    private Transaction transaction;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "patients_id")
    private Patients patients;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "referralId")
    private Referrals referral;

    public VaccinationTransaction addTxnDetail(VaccinationTransactionsDetails transactions) {
        this.vaccinationTransactionsDetails.add(transactions);
        transactions.setVaccinationTransaction(this);
        return this;
    }
}
