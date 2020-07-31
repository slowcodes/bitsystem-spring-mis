package ng.com.bitsystems.mis.models.pharmacy;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PharmacyProducts  extends BaseEntity {

     private SalesPriceCode salesPriceCode;
     private PharmacyProductCategory pharmacyProductCategory;
     private PharmacyProductRetailMeasure pharmacyProductRetailMeasure;
     private String product;
     private String description;
     private byte[] image;
     private Byte changePrice;
     private Set pharmacyPromosProductses = new HashSet(0);
     private Set patientDrugAllergies = new HashSet(0);
     private Set pharmacyInvoiceTransactionses = new HashSet(0);
     private Set pharmacyPromoProductBasedRewardses = new HashSet(0);
     private Set pharmacyProductBarcodeses = new HashSet(0);
     private Set inpatientPharmacyPrescriptionses = new HashSet(0);
     private Set pharmacyTransactionses = new HashSet(0);
     private Set vaccinationTransactionsPrescriptionses = new HashSet(0);

}


