package ng.com.bitsystems.mis.models.bloodbank;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.patients.Patients;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class DonorRegistry extends Patients {

     private String bloodGroup;
     private Set bloodbankDonotionQueues = new HashSet(0);

}


