package ng.com.bitsystems.mis.models.accounts;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;
import ng.com.bitsystems.mis.models.transactions.Service;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "other_services")
public class OtherServices extends Service {

     @JoinColumn(name = "expensebooks_id")
     @ManyToOne
     private ExpenseBooks expenseBooks;

     @Column(name = "service_description")
     private String description;

     @OneToOne(fetch = FetchType.EAGER)
     private ServicePriceCode servicePriceCode;

     @JoinColumn(name = "users_id")
     @ManyToOne
     private Users createdBy;

}


