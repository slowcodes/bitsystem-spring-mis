package ng.com.bitsystems.mis.models.rewards.promos;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.AppUsers;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VolumedBasedPromos extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "user_id")
     private AppUsers appUsers;

     private String title;
     private String description;
     private LocalDate dateCreated;
     private Integer discount;
     private LocalDate startDay;
     private LocalDate endDay;
     private Double minTxnTotal;
     private Integer exclusivity;

}


