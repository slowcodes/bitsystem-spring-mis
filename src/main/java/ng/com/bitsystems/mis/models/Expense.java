package ng.com.bitsystems.mis.models;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Expense  extends BaseEntity {

     private String teller;
     private String username;
     private String edate;
     private double amount;
     private String purpose;
     private String issueTo;

}


