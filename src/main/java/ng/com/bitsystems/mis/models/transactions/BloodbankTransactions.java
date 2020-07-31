package ng.com.bitsystems.mis.models.transactions;
import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.models.bloodbank.Storage;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BloodbankTransactions  extends BaseEntity {

     private Integer id;
     private Storage storage;
     private BloodbankTransactionDetails bloodbankTransactionDetails;
     private ServicePriceCode servicePriceCode;
     private Integer userDiscount;
     private String comment;

}


