package ng.com.bitsystems.mis.models.transactions.pharmacy;

import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@MappedSuperclass
public class BasePharmTxnDetails extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "pharmacyproducts_id")
    private PharmacyProducts pharmacyProducts;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pharmacyTransactionDetails")
    private Set<AdditionalTransactionDetails> additionalTransactionDetails = new HashSet<>();
}
