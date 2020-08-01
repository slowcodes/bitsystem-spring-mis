package ng.com.bitsystems.mis.models.accounts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="expense_books")
public class ExpenseBooks extends BaseEntity {

     @Column(name = "desciption")
     private String description;

     @Column(name = "parent_book")
     private Integer parentBook;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "expenseBook")
     private Set<ExpenseManager> expenseManager = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "expenseBook")
     private Set<OtherServices> otherServices = new HashSet<>();

}


