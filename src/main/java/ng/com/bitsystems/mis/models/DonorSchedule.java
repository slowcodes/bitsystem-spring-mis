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
public class DonorSchedule  extends BaseEntity{

     private DonorRegistry donorRegistry;
     private String txnId;
     private Date timeOfSchedule;
     private String mode;
     private String status;

}


