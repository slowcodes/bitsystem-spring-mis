package ng.com.bitsystems.mis.models;

import lombok.*;

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
public class LaboratoryTransactionDetails  extends BaseEntity {

     private Patients patients;
     private Referrals referrals;
     private Users users;
     private Date transactionTime;
     private String txnType;
     private Date txnDate;
     private double percentageDiscount;
     private Set referralLaboratorySettlementses = new HashSet(0);
     private Set laboratoryTransactionses = new HashSet(0);

}


