package ng.com.bitsystems.mis.models.pharmacy;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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


