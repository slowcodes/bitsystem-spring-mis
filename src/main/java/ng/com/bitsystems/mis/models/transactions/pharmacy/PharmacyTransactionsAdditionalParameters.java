package ng.com.bitsystems.mis.models.transactions.pharmacy;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PharmacyTransactionsAdditionalParameters  extends BaseEntity {

     private String parameter;
     private String description;
     private String dataType;
     private Set pharmacyTransactionAddtitionalParameterPretexts = new HashSet(0);
     private Set pharmacyTransactionsAdditionalDetailses = new HashSet(0);


}


