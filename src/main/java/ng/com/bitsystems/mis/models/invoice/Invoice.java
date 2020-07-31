package ng.com.bitsystems.mis.models.invoice;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.referrals.Referrals;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class Invoice extends BaseEntity {


    private Integer status;
    private Patients patients;
    private Referrals referrals;
    private Users users;
    private Date transactionTime;
    private String presentingComplaint;
    private String provsionalDiagnosis;
    private Date txnDate;
    private double percentageDiscount;
}
