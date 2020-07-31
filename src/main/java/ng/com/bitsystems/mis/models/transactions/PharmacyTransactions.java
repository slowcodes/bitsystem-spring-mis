package ng.com.bitsystems.mis.models.transactions;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;

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
public class PharmacyTransactions  extends BaseEntity {

     private SalesPriceCode salesPriceCode;
     private PharmacyProducts pharmacyProducts;
     private PharmacyTransactionDetailsSales pharmacyTransactionDetailsSales;
     private Date transactionDate;
     private Double qty;
     private Integer useDiscountPrice;
     private Double userDiscount;
     private String comment;
     private Integer reversal;
     private Set pharmacyPromoProductRecivedLogses = new HashSet(0);
     private Set pharmacyTransactionsAdditionalDetailses = new HashSet(0);

}


