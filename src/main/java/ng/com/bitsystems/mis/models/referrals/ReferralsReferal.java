package ng.com.bitsystems.mis.models.referrals;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ReferralsReferal  extends BaseEntity {
     private Referrals referralsByReferredId;
     private Referrals referralsByReferralId;

}


