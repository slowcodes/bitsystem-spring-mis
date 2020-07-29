package ng.com.bitsystems.mis.models;



import lombok.*;

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
public class DonorRegistry  extends BaseEntity {

     private Patients patients;
     private String bloodGroup;
     private Date lastDonationDate;
     private Set donorSchedules = new HashSet(0);

}


