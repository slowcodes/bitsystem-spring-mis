package ng.com.bitsystems.mis.models;


import lombok.*;

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

     private Integer preparedBy;
     private Date datePrepared;
     private Integer commision;
     private Set referralLaboratorySettlementses = new HashSet(0);

}


