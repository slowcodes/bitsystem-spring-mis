package ng.com.bitsystems.mis.models.pharmacy;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.Supplies;
import ng.com.bitsystems.mis.models.users.Person;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Suppliers extends Person {

     private String companyName;

     @ManyToMany(mappedBy = "suppliers")
     private Set<PharmacyProducts> pharmacyProducts = new HashSet<>();

     @OneToMany
     private Set<Supplies> supplies = new HashSet<>();

     public Suppliers addSupply(Supplies supplier) {
          this.supplies.add(supplier);
          supplier.setSupplier(this);
          return this;
     }
}


