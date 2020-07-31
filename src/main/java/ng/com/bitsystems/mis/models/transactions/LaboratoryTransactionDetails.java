package ng.com.bitsystems.mis.models.transactions;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class LaboratoryTransactionDetails  extends Transaction {

     private String presentingComplaint;
     private String provsionalDiagnosis;
     private Set insuranceLaboratoryTransactions = new HashSet(0);
     private Set referralLaboratorySettlementses = new HashSet(0);
     private Set laboratoryTransactionses = new HashSet(0);

}


