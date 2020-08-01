package ng.com.bitsystems.mis.models.rewards.promos;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Promos extends BaseEntity {

     private Users users;
     private String title;
     private String description;
     private Date dateCreated;
     private Integer discount;
     private Date startDay;
     private Date endDay;
     private Double minTxnTotal;
     private Integer exclusivity;

}


