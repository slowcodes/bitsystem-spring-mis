package ng.com.bitsystems.mis.models.bloodbank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.payments.BloodbankDonationPayments;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
     private Users users;

     private Date timeOfSchedule;
     private String status;
     private Compensation compensation;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "donationQueue")
     private Set<BloodbankDonationPayments> bloodbankDonationPayments = new HashSet<>();

}


