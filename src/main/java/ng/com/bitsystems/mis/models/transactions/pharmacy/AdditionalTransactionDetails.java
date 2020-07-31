package ng.com.bitsystems.mis.models.transactions.pharmacy;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class AdditionalTransactionDetails extends BaseEntity{

     private PharmacyService pharmacyTransactionDetails;
     private AdditionalTransactionParameters pharmacyTransactionsAdditionalParameters;
     private Integer showInReciept;
     private String value;

}


