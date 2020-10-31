package ng.com.bitsystems.mis.models.laboratories.bloodbank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;

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
     private Set<IssuanceLogs> issuanceLogs = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "storage")
     private Set<Donations> donations=new HashSet<>();


     public Storage addDonation(Donations donations) {
          this.donations.add(donations);
          donations.setStorage(this);
          return this;
     }

    public Storage addIssuanceLog(IssuanceLogs issuanceLogs) {
          this.issuanceLogs.add(issuanceLogs);
          issuanceLogs.setStorage(this);
          return this;
    }
}


