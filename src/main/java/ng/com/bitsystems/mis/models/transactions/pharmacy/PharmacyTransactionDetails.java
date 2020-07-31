package ng.com.bitsystems.mis.models.transactions.pharmacy;

import lombok.*;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.transactions.Sales;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PharmacyTransactionDetails extends Sales {
    PharmacyProducts pharmacyProducts;
    private PharmacyTransaction pharmacyTransaction;
}
