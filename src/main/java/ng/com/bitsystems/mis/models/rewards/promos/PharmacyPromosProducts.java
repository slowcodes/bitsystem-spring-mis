package ng.com.bitsystems.mis.models.rewards.promos;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.users.AppUsers;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PharmacyPromosProducts  extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "pharmacyproducts_id")
     private PharmacyProducts pharmacyProducts;

     @ManyToOne
     @JoinColumn(name = "users_id")
     private AppUsers appUsers;

     private int status;
     private String title;
     private String description;
     private LocalDate dateCreated;
     private LocalDate startDay;
     private LocalDate endDay;
     private Integer qty;
     private Integer productPromoExclusivity;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "pharmacyPromosProducts")
     private Set<PharmacyPromoProductRecivedLogs> pharmacyPromoProductRecivedLogs= new HashSet<>();

    public PharmacyPromosProducts addRecievedLog(PharmacyPromoProductRecivedLogs recivedLogs) {
         pharmacyPromoProductRecivedLogs.add(recivedLogs);
         recivedLogs.setPharmacyPromosProducts(this);
         return this;
    }
}


