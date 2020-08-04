package ng.com.bitsystems.mis.models.referrals;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReferralLaboratorySettlements  extends BaseEntity {

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralLaboratorySettlements" )
     private Set<LaboratoryTransaction> laboratoryTransaction = new HashSet<>();

     @ManyToOne
     @JoinColumn(name = "ReferralLaboratorySettlementDetails_id")
     private ReferralLaboratorySettlementDetails referralLaboratorySettlementDetails;

     private LocalDateTime logTime;


}


