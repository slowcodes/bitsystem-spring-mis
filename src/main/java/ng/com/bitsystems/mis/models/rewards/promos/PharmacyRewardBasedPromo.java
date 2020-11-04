package ng.com.bitsystems.mis.models.rewards.promos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
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
public class PharmacyRewardBasedPromo extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "pharmacyproducts_id", insertable = false, updatable = false)
     private PharmacyProducts rewardProducts;

     @ManyToOne
     @JoinColumn(name = "pharmacyproducts_id", insertable = false, updatable = false)
     private PharmacyProducts promosProducts;

     private int qty;

     @OneToOne
     private PharmacyRewardBasedPromo pharmacyRewardBasedPromo;
}


