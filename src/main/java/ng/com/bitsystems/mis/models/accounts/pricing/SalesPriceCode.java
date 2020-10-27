package ng.com.bitsystems.mis.models.accounts.pricing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SalesPriceCode extends BaseEntity {

     @Column(name = "buying_price")
     private Double buyingPrice;

     @Column(name="selling_price")
     private Double sellingPrice;

     @Column(name="discount_price")
     private Double discountPrice;

     @Column(name="discount_quantity")
     private Integer discountQty;

     private Double tax;
//     @OneToOne
//     private Storage storage;
//
//     @OneToOne
//     private BloodbankTransactionDetails bloodbankTransactionDetails;

     //private Set <PharmacyTransactionDetails> pharmacyTransactionDetails = new HashSet<>();
     //private Set <Inventory> inventories = new HashSet<>();
}


