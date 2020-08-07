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


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class ClearedQueue extends BaseEntity {

     @OneToOne
     private DonationQueue donationQueue;

     @ManyToOne
     @JoinColumn(name = "users_id")
     private Users users;
     private Integer timeOfClearance;

     @OneToOne
     private BleedingSchedule bleedingSchedules;
}


