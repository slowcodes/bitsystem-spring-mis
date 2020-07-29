package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class DonorDonatedStorage  extends BaseEntity {

     private String location;
     private String description;
     private Set donorDonateds = new HashSet(0);
}


