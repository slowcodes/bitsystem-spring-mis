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
public class DonorDonated  extends BaseEntity{

     private DonorDonatedStorage donorDonatedStorage;
     private Users users;
     private String txnId;
     private Date timeOfDonation;
     private String tagId;

}


