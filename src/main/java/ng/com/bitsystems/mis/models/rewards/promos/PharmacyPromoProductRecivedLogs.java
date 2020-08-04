package ng.com.bitsystems.mis.models.rewards.promos;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1



/**
 * PharmacyPromoProductRecivedLogs generated by hbm2java
 */

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransactionDetails;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PharmacyPromoProductRecivedLogs  extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "pharmacypromosproducts_id")
     private PharmacyPromosProducts pharmacyPromosProducts;

     @OneToOne
     private PharmacyTransactionDetails pharmacyTransactionDetails;


}


