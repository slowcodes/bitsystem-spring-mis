package ng.com.bitsystems.mis.models.referrals;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Referrals  extends BaseEntity {
     private String name;
     private String phone;
     private String organisation;
     private String email;
     private String bank;
     private String account;
     private String address;
     private Set laboratoryInvoiceDetailses = new HashSet(0);
     private Set vaccinationTransactionsDetailses = new HashSet(0);
     private Set referralsReferalsForReferredId = new HashSet(0);
     private Set referralsReferalsForReferralId = new HashSet(0);
     private Set laboratoryTransactionDetailses = new HashSet(0);
     private Set radiologyInvoiceTransactionDetailses = new HashSet(0);

}


