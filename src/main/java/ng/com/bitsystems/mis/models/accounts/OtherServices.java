package ng.com.bitsystems.mis.models.accounts;


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.Service;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="other_services")
public class OtherServices extends Service {

     @Column(name = "expense_book")
     private ExpenseBooks expenseBooks;
     private Set accountsOtherServiceBillingsPaymentses = new HashSet(0);

}


