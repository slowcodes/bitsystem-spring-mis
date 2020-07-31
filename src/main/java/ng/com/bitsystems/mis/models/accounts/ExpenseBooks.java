package ng.com.bitsystems.mis.models.accounts;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="expense_books")
public class ExpenseBooks extends BaseEntity {

//     @Column(name = "expense_book")
//     @OneToMany(cascade = CascadeType.ALL, mappedBy = "expenseBook")
//     private ExpenseBooks expenseBooks;

     @Column(name = "desciption")
     private String description;

     @Column(name = "parent_book")
     private Set<ExpenseBooks> parentBook = new HashSet<>();

     @Column(name = "expense_manager")
     private Set<ExpenseManager> expenseManager = new HashSet<>();

     @Column(name = "other_service")
     private Set<OtherServices> otherServices = new HashSet<>();

}


