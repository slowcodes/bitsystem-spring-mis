package ng.com.bitsystems.mis.models.pharmacy;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PharmacyProductCategory  extends BaseEntity {

     private PharmacyProductCategory pharmacyProductCategory;
     private String categoryName;
     private String categoryDesc;
     private Date entryDate;
     private Set pharmacyProductCategories = new HashSet(0);
     private Set pharmacyProductses = new HashSet(0);

}


