package ng.com.bitsystems.mis.models.accounts;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ExpenseBooks extends BaseEntity {

     private ExpenseBooks expenseBooks;
     private Integer book;
     private Integer description;
     private Set accountExpenseBookses = new HashSet(0);
     private Set accountExpenseManagers = new HashSet(0);
     private Set accountsOtherServiceBillingses = new HashSet(0);

}


