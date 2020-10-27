package ng.com.bitsystems.mis.models.accounts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AccountBooks extends BaseEntity {

     @Column(name = "desciption")
     private String description;

     @Column(name = "parent_book")
     private Long parentBook;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "expenseBooks")
     private Set<ExpenseManager> expenseManager = new HashSet<>();

     @ManyToOne
     @JoinColumn(name="users_id")
     private Users createdBy;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "accountBook")
     private Set<OtherServices> otherServices = new HashSet<>();

     public AccountBooks addExpense(ExpenseManager expenseManager) {
          this.expenseManager.add(expenseManager);
          expenseManager.setAccountBooks(this);
          return this;
     }

     public AccountBooks addOtherService(OtherServices otherServices) {
          this.otherServices.add(otherServices);
          otherServices.setAccountBooks(this);
          return this;
     }
}

