package ng.com.bitsystems.mis.models.accounts.pricing;


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ServicePriceCode extends BaseEntity {
     private Integer priceId;
     private Double buyingPrice;
     private Double discountQty;
     private Double sellingPrice;
     private Double discountPrice;
     private Double servicePrice;
     private Set radiologyInvestigationses = new HashSet(0);
     private Set inventories = new HashSet(0);
     private Set laboratoryTransactionses = new HashSet(0);
     private Set laboratoryInvestigationses = new HashSet(0);
     private Set laboratoryInvoiceTrasactionses = new HashSet(0);
     private Set bloodbankDonorDonatedStorages = new HashSet(0);
     private Set bloodbankTransactionses = new HashSet(0);
     private Set radiologyInvoiceTransactionses = new HashSet(0);
     private Set radiologyTransactionses = new HashSet(0);
}


