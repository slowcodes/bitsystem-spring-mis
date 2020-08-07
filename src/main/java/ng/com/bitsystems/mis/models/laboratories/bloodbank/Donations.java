package ng.com.bitsystems.mis.models.laboratories.bloodbank;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Donations extends BaseEntity {

     @OneToOne
     private BleedingSchedule bleedingSchedule;

     @ManyToOne
     @JoinColumn(name = "storage_id")
     private Storage storage;

     @ManyToOne
     @JoinColumn(name = "users_id")
     private Users users;

     private LocalDateTime timeOfDonation;
     private String tagId;

}


