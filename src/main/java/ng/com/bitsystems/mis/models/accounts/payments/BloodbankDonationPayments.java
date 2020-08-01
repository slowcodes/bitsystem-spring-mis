package ng.com.bitsystems.mis.models.accounts.payments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.bloodbank.DonotionQueue;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="bloodbank_donation_payments")
public class BloodbankDonationPayments  extends Payments {

     @ManyToOne
     private DonotionQueue donotionQueue;

}


