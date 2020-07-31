package ng.com.bitsystems.mis.models.laboratories;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.referrals.Referrals;
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
public class RadiologyTransactionDetails  extends BaseEntity {

     private Patients patients;
     private Referrals referrals;
     private Users users;
     private Date transactionTime;
     private String presentingComplaint;
     private String provsionalDiagnosis;
     private Date txnDate;
     private double percentageDiscount;
     private Set radiologyTransactionses = new HashSet(0);
     private Set insuranceRadiologyTransactions = new HashSet(0);

}


