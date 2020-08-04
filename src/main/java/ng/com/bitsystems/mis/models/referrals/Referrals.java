package ng.com.bitsystems.mis.models.referrals;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.bloodbank.BloodbankTransaction;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransaction;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransaction;
import ng.com.bitsystems.mis.models.users.Person;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
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

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referral")
     private Set<PharmacyTransaction> pharmacyTransactions = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referral")
     private Set<VaccinationTransaction> vaccinationTransactions = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referralreferral")
     private Set<ReferralsReferal> referralreferral = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referred")
     private Set<ReferralsReferal> referred  = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referral")
     private Set<LaboratoryTransaction> laboratoryTransactions = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "referral")
     private Set<BloodbankTransaction> bloodbankTransactions= new HashSet<>();

}


