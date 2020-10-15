package ng.com.bitsystems.mis.models.referrals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransactionDetails;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReferralBloodBankSettlement extends BaseEntity {

    @OneToOne
    private ReferralSettlements referralSettlements;

    @ManyToOne
    @JoinColumn(name = "bloodBankTransactionDetails_id")
    private BloodbankTransactionDetails bloodbankTransactionDetails;

}