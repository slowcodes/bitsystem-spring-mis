package ng.com.bitsystems.mis.models.referrals;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.OtherServices;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReferralOtherServiceSettlement extends BaseEntity {

    @OneToOne
    private ReferralSettlements referralSettlements;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralSettlements")
    private Set<OtherServices> otherService = new HashSet<>();
}
