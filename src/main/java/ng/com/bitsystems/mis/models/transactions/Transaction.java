package ng.com.bitsystems.mis.models.transactions;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.referrals.Referrals;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.MappedSuperclass;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Transaction extends BaseEntity {
    private Patients patients;
    private Users users;
    private Date dateTransaction;
    private Date timeOfTransaction;
    private String comment;
    private Integer discount;
    private Referrals referrals;
    private Set insuranceLaboratoryTransactions = new HashSet(0);
    private Set referralLaboratorySettlementses = new HashSet(0);
}
