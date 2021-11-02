package ng.com.bitsystems.mis.models.pharmacy;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RetailMeasure extends BaseEntity {

     private String metric;
     private String mesures;

     @ManyToMany(mappedBy = "retailMeasure")
     private Set<PharmacyProducts> pharmacyProducts = new HashSet<>();

}


