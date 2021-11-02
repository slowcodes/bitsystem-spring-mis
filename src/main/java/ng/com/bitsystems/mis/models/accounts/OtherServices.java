package ng.com.bitsystems.mis.models.accounts;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.models.users.AppUsers;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OtherServices extends BaseEntity {

     @JoinColumn(name = "expensebooks_id")
     @ManyToOne
     private AccountBooks accountBook;

     @Column(name = "service_description")
     private String description;

     @JoinColumn(name = "users_id")
     @ManyToOne
     private AppUsers createdBy;

     @CreationTimestamp
     private LocalDateTime timeOfTransaction;

     @OneToOne
     private ServicePriceCode servicePriceCode;

}


