package ng.com.bitsystems.mis.models.referrals;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ReferralSettlements extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "user_id")
     private Users preparedBy;

     private LocalDate datePrepared;
     private Double commission;

}


