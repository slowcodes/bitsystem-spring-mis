package ng.com.bitsystems.mis.models.transactions;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigations;

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

     private LaboratoryInvestigations laboratoryInvestigations;
     private LaboratoryTransactionDetails laboratoryTransactionDetails;
     private ServicePriceCode servicePriceCode;
     private Date timeOfTransaction;
     private Integer frequency;
     private Integer userDiscount;
     private Integer useDiscountPrice;
     private Set laboratoryPendingSampleCollections = new HashSet(0);
     private Set laboratoryCollectedSampleses = new HashSet(0);
     private Set labaratoryInvestigationResultByParamses = new HashSet(0);


}


