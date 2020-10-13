package ng.com.bitsystems.mis.models.referrals;

import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.OneToOne;

public class ReferralPharmacySettlement extends BaseEntity {
    @OneToOne
    private ReferralSettlements referralSettlements;


}
