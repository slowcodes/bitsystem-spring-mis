package ng.com.bitsystems.mis.models.referrals;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReferralLaboratorySettlements  extends BaseEntity {


     private LaboratoryTransaction laboratoryTransaction;
     private ReferralLaboratorySettlementDetails referralLaboratorySettlementDetails;
     private Date logTime;


}


