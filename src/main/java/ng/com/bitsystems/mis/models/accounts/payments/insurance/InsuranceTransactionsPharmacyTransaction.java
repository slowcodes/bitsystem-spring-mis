package ng.com.bitsystems.mis.models.accounts.payments.insurance;

import lombok.*;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransaction;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InsuranceTransactionsPharmacyTransaction extends InsuranceTransactions {
     private PharmacyTransaction pharmacyTransaction;
}


