package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PharmacyStockBarcodes  extends BaseEntity {


     private PharmacyStock pharmacyStock;
     private String barcode;


}


