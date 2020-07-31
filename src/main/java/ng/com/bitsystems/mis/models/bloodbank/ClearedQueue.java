package ng.com.bitsystems.mis.models.bloodbank;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.laboratories.InvestigationResults;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ClearedQueue extends BaseEntity {

     private DonotionQueue donotionQueue;
     private Users users;
     private Integer timeOfClearance;
     private BleedingSchedule bleedingSchedules;
     private Set<InvestigationResults> investigationResults = new HashSet<>();
}


