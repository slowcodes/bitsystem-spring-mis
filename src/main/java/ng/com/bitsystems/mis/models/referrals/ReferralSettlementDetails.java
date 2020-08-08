package ng.com.bitsystems.mis.models.referrals;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.OtherServices;
import ng.com.bitsystems.mis.models.invoice.PharmacyInvoiceDetailsSale;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransactionDetails;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;

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
public class ReferralSettlementDetails extends BaseEntity {
     private Integer preparedBy;
     private Date datePrepared;
     private Integer commision;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralSettlementDetails")
     private Set<LaboratoryTransactionDetail> laboratoryTransactionDetails = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralSettlementDetails")
     private Set<BloodbankTransactionDetails> bloodbankTransactionDetails = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralSettlementDetails")
     private Set<OtherServices> otherService = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralSettlementDetails")
     private Set<PharmacyInvoiceDetailsSale> pharmacyInvoiceDetailsSales = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralSettlementDetails")
     private Set<VaccinationTransactionsDetails> vaccinationTransactionsDetails = new HashSet<>();

}


