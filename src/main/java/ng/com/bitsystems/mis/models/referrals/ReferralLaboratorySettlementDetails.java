package ng.com.bitsystems.mis.models.referrals;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ReferralLaboratorySettlementDetails  extends BaseEntity {

     private Integer id;
     private Integer preparedBy;
     private Date datePrepared;
     private Integer commision;
     private Set referralLaboratorySettlementses = new HashSet(0);

}


