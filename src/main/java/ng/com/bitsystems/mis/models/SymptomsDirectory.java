package ng.com.bitsystems.mis.models;
// Generated Jun 24, 2020 12:32:32 AM by Hibernate Tools 4.3.1


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
public class SymptomsDirectory  extends BaseEntity {


     private String symptoms;
     private Set clerksPcHistories = new HashSet(0);
     private Set clerksSymptomses = new HashSet(0);
     private Set symptomsClerkings = new HashSet(0);


}


