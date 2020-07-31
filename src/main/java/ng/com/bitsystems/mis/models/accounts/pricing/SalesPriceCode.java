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
public class SalesPriceCode extends BaseEntity {

     private Integer id;
     private Double buyingPrice;
     private Double sellingPrice;
     private Double discountPrice;
     private Integer discountQty;
     private Set pharmacyProductses = new HashSet(0);
     private Set pharmacyInvoiceTransactionses = new HashSet(0);
     private Set pharmacyTransactionses = new HashSet(0);

}


