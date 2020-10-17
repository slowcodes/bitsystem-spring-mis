package ng.com.bitsystems.mis.models.vaccination;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Vaccines extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "drug_id")
    private PharmacyProducts pharmacyProducts;

    @OneToOne
    private SalesPriceCode priceCode;

    private String description;
}
