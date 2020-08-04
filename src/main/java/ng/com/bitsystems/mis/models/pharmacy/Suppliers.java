package ng.com.bitsystems.mis.models.pharmacy;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.users.Person;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
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

}


