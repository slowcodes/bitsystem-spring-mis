package ng.com.bitsystems.mis.models;


import lombok.*;

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


