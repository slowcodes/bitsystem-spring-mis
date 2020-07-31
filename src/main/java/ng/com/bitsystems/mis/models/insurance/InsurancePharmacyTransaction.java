package ng.com.bitsystems.mis.models.insurance;

import lombok.*;
import ng.com.bitsystems.mis.models.transactions.PharmacyTransactionDetailsSales;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InsurancePharmacyTransaction  extends Insurance {
     private PharmacyTransactionDetailsSales pharmacyTransactionDetailsSales;
}


