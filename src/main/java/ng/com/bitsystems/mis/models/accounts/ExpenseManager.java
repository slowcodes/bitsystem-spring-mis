package ng.com.bitsystems.mis.models.accounts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="expense_manager")
public class ExpenseManager extends BaseEntity {

     @JoinColumn(name = "expense_books_id")
     @ManyToOne()
     private ExpenseBooks expenseBook;

     @Column(name = "fund_issuer")
     @ManyToOne()
     private Users usersByIssueTo;

     @Column(name = "fund_reciever")
     @ManyToOne()
     private Users usersByTeller;

     @Column(name = "date_of_expenditure")
     private LocalDate expenseDate;

     @Column(name = "amount")
     private double amount;

     @Column(name = "purpose_of_expenditure")
     private String purpose;

}


