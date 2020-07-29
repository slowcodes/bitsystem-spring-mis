package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PricingCode  extends BaseEntity {

     private Double buyingPrice;
     private Double discountQty;
     private Double sellingPrice;
     private Double discountPrice;
     private Double servicePrice;
     private Set tmpInvoiceTxns = new HashSet(0);
     private Set inventories = new HashSet(0);
     private Set laboratoryTransactionses = new HashSet(0);
     private Set pharmacyStocks = new HashSet(0);
     private Set laboratoryInvestigationses = new HashSet(0);
     private Set txnConsultionsDetailses = new HashSet(0);


}


