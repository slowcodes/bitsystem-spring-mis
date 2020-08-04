package ng.com.bitsystems.mis.models.accounts.payments;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.transactions.vaccination.VaccinationTransactionsDetails;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name="vaccination_transaction_payments")
public class VaccinationTransactionsPayments  extends Payments {

     @ManyToOne
     @JoinColumn(name = "vaccinationtransactionsdetails_id")
     private VaccinationTransactionsDetails vaccinationTransactionsDetails;

     @JoinColumn(name="users_id")
     @ManyToOne()
     private Users users;
}


