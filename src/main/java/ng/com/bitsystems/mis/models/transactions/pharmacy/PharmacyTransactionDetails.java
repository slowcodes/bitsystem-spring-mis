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

//    @OneToOne
//    PharmacyPromoProductRecivedLogs pharmacyPromoProductRecivedLogs;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pharmacyTransactionDetails")
    private Set<AdditionalSaleTransactionDetails> additionalSaleTransactionDetails = new HashSet<>();

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pharmacyTransactionDetails")
//    private Set<PharmacyPromoProductRecivedLogs> promo = new HashSet<>();
//
//    public PharmacyTransactionDetails addRecievedPromoLog(PharmacyPromoProductRecivedLogs recivedLogs) {
//        promo.add(recivedLogs);
//        recivedLogs.setPharmacyTransactionDetails(this);
//        return this;
//    }

    public PharmacyTransactionDetails addAdditionalDetail(AdditionalSaleTransactionDetails details) {
        additionalSaleTransactionDetails.add(details);
        details.setPharmacyTransactionDetails(this);
        return this;
    }

    public PharmacyTransactionDetails addRecievedPromoLog(PharmacyPromoProductRecivedLogs recivedLogs) {

        return this;
    }
}
