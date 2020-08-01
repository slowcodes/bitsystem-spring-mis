package ng.com.bitsystems.mis.models.referrals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReferralsReferal  extends BaseEntity {
     private Referrals referralsByReferredId;
     private Referrals referralsByReferralId;

}


