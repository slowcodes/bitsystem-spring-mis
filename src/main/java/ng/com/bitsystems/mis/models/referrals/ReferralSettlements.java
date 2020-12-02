package ng.com.bitsystems.mis.models.referrals;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReferralSettlements extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "user_id")
     private Users preparedBy;

     private LocalDate datePrepared;
     private Double commission;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralSettlements")
     private Set<ReferralPharmacySettlement> pharmacySettlement=new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralSettlements")
     private Set<ReferralLaboratorySettlements> laboratorySettlement=new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralSettlement")
     private Set<ReferralBloodBankSettlement> bloodBankSettlement=new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralSettlements")
     private Set<ReferralOtherServiceSettlement> otherServiceSettlements=new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralSettlements")
     private Set<ReferralVaccinationSettlement> vaccinationSettlements=new HashSet<>();

     public ReferralSettlements addPharmSaleTxnSettlement(ReferralPharmacySettlement settlement) {
          pharmacySettlement.add(settlement);
          settlement.setReferralSettlements(this);
          return this;
     }

     public ReferralSettlements addLabTxnSettlement(ReferralLaboratorySettlements settlement) {
          laboratorySettlement.add(settlement);
          settlement.setReferralSettlements(this);
          return this;
     }
     public ReferralSettlements addBBTxnSettlement(ReferralBloodBankSettlement settlement) {
          bloodBankSettlement.add(settlement);
          settlement.setReferralSettlement(this);
          return this;
     }
     public ReferralSettlements addVaccTxnSettlement(ReferralVaccinationSettlement settlement) {
          vaccinationSettlements.add(settlement);
          settlement.setReferralSettlements(this);
          return this;
     }

     public ReferralSettlements addOtherServiceTxnSettlement(ReferralOtherServiceSettlement settlement) {
          otherServiceSettlements.add(settlement);
          settlement.setReferralSettlements(this);
          return this;
     }
}


