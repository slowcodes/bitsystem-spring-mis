package ng.com.bitsystems.mis.models.transactions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.referrals.Referrals;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ServiceTransaction extends BaseEntity {

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patients patients;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Transaction transaction;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "referralId")
    private Referrals referral;

    private Integer userDiscount;
}
