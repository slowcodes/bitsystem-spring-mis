package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PharmacyStock  extends BaseEntity {

     private PharmacyStockCategories pharmacyStockCategories;
     private PricingCode pricingCode;
     private String item;
     private int qtyAvl;
     private String measure;
     private String type;
     private String productDesc;
     private Date dateEntered;
     private Set vaccineMedications = new HashSet(0);
     private Set pharmacyPrescriptionses = new HashSet(0);
     private Set drugAllergies = new HashSet(0);
     private Set pharmacyStockBarcodeses = new HashSet(0);


}


