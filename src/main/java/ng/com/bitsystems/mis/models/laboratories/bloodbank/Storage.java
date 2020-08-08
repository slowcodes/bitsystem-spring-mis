package ng.com.bitsystems.mis.models.laboratories.bloodbank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransactionDetails;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Storage extends BaseEntity {

     @OneToOne
     private SalesPriceCode salesPriceCode;

     private String location;

     private String description;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "storage")
     private Set <BloodbankTransactionDetails> bloodbankTransactionDetails = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "storage")
     private Set<Donations> donations = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "storage")
     private Set<IssueLog> issueLogs = new HashSet<>();
}


