package ng.com.bitsystems.mis.models.accounts.pricing;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Storage;
import ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank.BloodbankTransactionDetails;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


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

     @OneToOne
     private Storage storage;

     @OneToOne
     private BloodbankTransactionDetails bloodbankTransactionDetails;

     //private Set <PharmacyTransactionDetails> pharmacyTransactionDetails = new HashSet<>();
     //private Set <Inventory> inventories = new HashSet<>();
}


