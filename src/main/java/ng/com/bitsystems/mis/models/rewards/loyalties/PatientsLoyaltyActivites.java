package ng.com.bitsystems.mis.models.rewards.loyalties;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientsLoyaltyActivites  extends BaseEntity {

     @Enumerated(value = EnumType.ORDINAL)
     private Activities activities;

     private Integer points;
     private Integer active;
}


