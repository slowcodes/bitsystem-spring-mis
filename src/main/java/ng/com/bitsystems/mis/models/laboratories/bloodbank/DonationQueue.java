package ng.com.bitsystems.mis.models.laboratories.bloodbank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.AppUsers;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DonationQueue extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "donorregistry_id")
     private DonorRegistry donorRegistry;

     @ManyToOne
     @JoinColumn(name = "users_id")
     private AppUsers appUsers;

     private Date timeOfSchedule;
     private String status;
     private Compensation compensation;



}


