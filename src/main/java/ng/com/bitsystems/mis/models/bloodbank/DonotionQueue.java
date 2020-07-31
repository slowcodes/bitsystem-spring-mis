package ng.com.bitsystems.mis.models.bloodbank;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
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
public class DonotionQueue extends BaseEntity {

     private DonorRegistry donorRegistry;
     private Users users;
     private Date timeOfSchedule;
     private String status;
     private Compensation compensation;
     private Set bloodbankDonationPaymentses = new HashSet(0);
     private Set bloodbankDonationClearedQueues = new HashSet(0);

}


