package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class DonorBleedingSchedule  extends BaseEntity {

     private Users users;
     private String txnId;
     private Date timeOfSchedule;

}


