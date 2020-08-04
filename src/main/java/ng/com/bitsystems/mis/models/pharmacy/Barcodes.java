package ng.com.bitsystems.mis.models.pharmacy;


import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
public class Barcodes extends BaseEntity {
    private String barcode;

    @ManyToOne
    @JoinColumn(name = "pharmacyproducts_id")
    private PharmacyProducts pharmacyProducts;
}
