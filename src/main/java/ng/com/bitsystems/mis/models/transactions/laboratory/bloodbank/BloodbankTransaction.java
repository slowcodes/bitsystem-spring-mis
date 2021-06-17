package ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
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
public class BloodbankTransaction extends BaseEntity {

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "bloodbanktransaction")
     private Set <BloodbankTransactionDetails> bloodbankTransactionDetails = new HashSet<>();

    @OneToOne
    private Transaction transaction;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "referralId")
    private Referrals referral;

    public BloodbankTransaction addBBTxnDetails(BloodbankTransactionDetails bloodbankTransactionDetails) {
        this.bloodbankTransactionDetails.add(bloodbankTransactionDetails);
        bloodbankTransactionDetails.setBloodbanktransaction(this);
        return this;
    }


}


