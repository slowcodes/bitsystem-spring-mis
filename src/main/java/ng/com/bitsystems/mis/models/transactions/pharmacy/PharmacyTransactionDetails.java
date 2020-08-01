package ng.com.bitsystems.mis.models.transactions.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.transactions.Sales;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PharmacyTransactionDetails extends Sales {
    PharmacyProducts pharmacyProducts;
    private PharmacyTransaction pharmacyTransaction;
}
