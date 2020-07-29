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
public class LaboratoryTransactions  extends BaseEntity {

     private LaboratoryTransactionDetails laboratoryTransactionDetails;
     private PricingCode pricingCode;
     private Date timeOfTransaction;
     private Integer frequency;
     private Integer investigation;
     private Integer userDiscount;
     private Integer useDiscountPrice;
     private Set laboratoryPendingSampleCollections = new HashSet(0);
     private Set laboratoryCollectedSampleses = new HashSet(0);
     private Set labaratoryInvestigationResultByParamses = new HashSet(0);

}


