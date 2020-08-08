package ng.com.bitsystems.mis.models.transactions.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromoProductRecivedLogs;
import ng.com.bitsystems.mis.models.transactions.Sales;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PharmacyTransactionDetails extends Sales {

    @ManyToOne
    @JoinColumn(name = "pharmacyproducts_id")
    private PharmacyProducts pharmacyProducts;


    @ManyToOne
    @JoinColumn(name = "pharmacytransaction_id")
    private PharmacySalesTransaction pharmacySalesTransaction;

    @OneToOne
    PharmacyPromoProductRecivedLogs pharmacyPromoProductRecivedLogs;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pharmacyTransactionDetails")
    private Set<AdditionalTransactionDetails> additionalTransactionDetails = new HashSet<>();
}
