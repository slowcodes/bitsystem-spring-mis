package ng.com.bitsystems.mis.models.transactions.bloodbank;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.transactions.Transaction;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BloodbankTransaction extends Transaction {

     private Set bloodbankTransactionses = new HashSet(0);
     private Set insuranceBloodbankTransactions = new HashSet(0);

}


