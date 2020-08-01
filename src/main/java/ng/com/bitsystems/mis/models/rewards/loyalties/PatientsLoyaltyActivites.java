package ng.com.bitsystems.mis.models.rewards.loyalties;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientsLoyaltyActivites  extends BaseEntity {

     private String activity;
     private Integer points;
     private Set patientsLoyaltyGainses = new HashSet(0);

}


