package ng.com.bitsystems.mis.models.transactions;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PharmacyTransactionsAdditionalDetails  extends BaseEntity{

     private PharmacyTransactions pharmacyTransactions;
     private PharmacyTransactionsAdditionalParameters pharmacyTransactionsAdditionalParameters;
     private Integer showInReciept;
     private String value;


}


