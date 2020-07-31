package ng.com.bitsystems.mis.models.insurance;

import lombok.*;
import ng.com.bitsystems.mis.models.transactions.LaboratoryTransactionDetails;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InsuranceLaboratoryTransaction  extends Insurance {
     private LaboratoryTransactionDetails laboratoryTransactionDetails;
}


