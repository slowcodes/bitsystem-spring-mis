package ng.com.bitsystems.mis.models.accounts;
import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name ="expense_manager")
public class ExpenseManager extends BaseEntity {

     @Column(name = "expense_books")
     private ExpenseBooks expenseBooks;
     @Column(name = "fund_issuer")
     private Users usersByIssueTo;
     @Column(name = "fund_reciever")
     private Users usersByTeller;
     @Column(name = "date_of_expenditure")
     private Date expenseDate;
     @Column(name = "amount")
     private double amount;
     @Column(name = "purpose_of_expenditure")
     private String purpose;

}


