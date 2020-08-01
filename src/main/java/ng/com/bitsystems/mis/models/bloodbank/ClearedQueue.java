package ng.com.bitsystems.mis.models.bloodbank;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class ClearedQueue extends BaseEntity {

     private DonotionQueue donotionQueue;
     private Users users;
     private Integer timeOfClearance;
     private BleedingSchedule bleedingSchedules;
}


