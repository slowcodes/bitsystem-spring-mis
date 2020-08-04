package ng.com.bitsystems.mis.models.accounts.payments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.bloodbank.DonationQueue;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "bloodbank_donation_payments")
public class BloodbankDonationPayments  extends Payments {

     @ManyToOne
     @JoinColumn(name = "donationqueue_id")
     private DonationQueue donationQueue;

     @JoinColumn(name="users_id")
     @ManyToOne()
     private Users users;

}


