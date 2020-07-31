package ng.com.bitsystems.mis.models.bloodbank;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


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
public class BleedingSchedule extends BaseEntity {
     private ClearedQueue clearedQueue;
     private Users users;
     private Date timeOfSchedule;
     private Set bloodbankDonorDonateds = new HashSet(0);
}


