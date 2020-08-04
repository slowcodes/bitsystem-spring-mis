package ng.com.bitsystems.mis.models.referrals;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReferralLaboratorySettlementDetails  extends BaseEntity {
     private Integer preparedBy;
     private Date datePrepared;
     private Integer commision;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralLaboratorySettlementDetails")
     private Set<ReferralLaboratorySettlements> referralLaboratorySettlements = new HashSet<>();

}


