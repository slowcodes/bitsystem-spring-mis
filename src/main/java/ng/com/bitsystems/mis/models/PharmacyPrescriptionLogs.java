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
public class PharmacyPrescriptionLogs  extends BaseEntity {


     private Users users;
     private String notes;
     private Date logTime;


}


