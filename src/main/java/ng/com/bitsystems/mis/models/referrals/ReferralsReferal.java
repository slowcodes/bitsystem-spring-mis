package ng.com.bitsystems.mis.models.referrals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReferralsReferal  extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "referrals_id", insertable = false, updatable = false)
     private Referrals referred;

     @ManyToOne
     @JoinColumn(name = "referrals_id", insertable = false, updatable = false)
     private Referrals referralreferral;

}


