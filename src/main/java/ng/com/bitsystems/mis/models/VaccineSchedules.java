package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class VaccineSchedules  extends BaseEntity {

     @ManyToOne
     private Patients patients;
     private Users users;
     private String txnId;
     private Date scheduledDate;

}


