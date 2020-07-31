package ng.com.bitsystems.mis.models.referrals;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.LaboratoryTransactionDetails;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ReferralLaboratorySettlements  extends BaseEntity {


     private LaboratoryTransactionDetails laboratoryTransactionDetails;
     private ReferralLaboratorySettlementDetails referralLaboratorySettlementDetails;
     private Date logTime;


}


