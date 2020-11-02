package ng.com.bitsystems.mis.models.pharmacy;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class Category extends BaseEntity {
     private String categoryName;
     private String categoryDesc;
     private LocalDate entryDate;

     @ManyToMany(mappedBy = "categories")
     private Set<PharmacyProducts> pharmacyProducts = new HashSet<>();
}


