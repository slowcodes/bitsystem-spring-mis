package ng.com.bitsystems.mis.models.referrals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReferralLaboratorySettlements extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "settlementId")
    private ReferralSettlements referralSettlements;

    @ManyToOne
    @JoinColumn(name = "labTxnId")
    private LaboratoryTransaction laboratoryTransaction;

}
