package ng.com.bitsystems.mis.models.laboratories;


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;

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
public class RadiologyTransactions  extends BaseEntity {

     private ServicePriceCode servicePriceCode;
     private RadiologyInvestigations radiologyInvestigations;
     private ng.com.bitsystems.mis.models.laboratories.RadiologyTransactionDetails radiologyTransactionDetails;
     private Date timeOfTransaction;
     private Integer frequency;
     private Integer userDiscount;
     private Integer useDiscountPrice;
     private Set radiologyInvestigationQueues = new HashSet(0);

}


