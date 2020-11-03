package ng.com.bitsystems.mis.models.referrals;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.OtherServices;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransaction;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacySalesTransaction;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;
import ng.com.bitsystems.mis.models.users.Person;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Referrals  extends Person {

     private String organisation;
     private String bank;
     private String account;

     @ManyToOne
     @JoinColumn(name = "refferal_id")
     private Referrals referrals;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referral")
     private Set<PharmacySalesTransaction> pharmacySalesTransactions = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referral")
     private Set<VaccinationTransaction> vaccinationTransactions = new HashSet<>();

//     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralreferral")
//     private Set<ReferralsReferal> referralreferral = new HashSet<>();
//
//     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referred")
//     private Set<ReferralsReferal> referred  = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referral")
     private Set<LaboratoryTransaction> laboratoryTransactions = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referral")
     private Set<BloodbankTransaction> bloodbankTransactions= new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referral")
     private Set<OtherServices> otherServices= new HashSet<>();

}


