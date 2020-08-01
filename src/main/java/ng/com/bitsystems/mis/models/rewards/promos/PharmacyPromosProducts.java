package ng.com.bitsystems.mis.models.rewards.promos;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PharmacyPromosProducts  extends BaseEntity {

     private PharmacyProducts pharmacyProducts;
     private Users users;
     private int status;
     private String title;
     private String description;
     private Date dateCreated;
     private Date startDay;
     private Date endDay;
     private Integer qty;
     private Integer productPromoExclusivity;
     private Set pharmacyPromoProductBasedRewardses = new HashSet(0);
     private Set pharmacyPromoProductRecivedLogses = new HashSet(0);

}


