package ng.com.bitsystems.mis.models.accounts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "expense_manager")
public class ExpenseManager extends BaseEntity {

     @JoinColumn(name = "users_id", insertable = false, updatable = false)
     @ManyToOne()
     private Users usersByIssueTo;

     @JoinColumn(name = "users_id", insertable = false, updatable = false)
     @ManyToOne()
     private Users usersByTeller;

     @Column(name = "date_of_expenditure")
     private LocalDate expenseDate;

     @Column(name = "amount")
     private double amount;

     @Column(name = "purpose_of_expenditure")
     private String purpose;

     @ManyToOne
     @JoinColumn(name="expensebook_id")
     private ExpenseBooks expenseBooks;

}


