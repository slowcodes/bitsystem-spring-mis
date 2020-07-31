package ng.com.bitsystems.mis.models.transactions.vaccination;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.patients.Patients;
import ng.com.bitsystems.mis.models.referrals.Referrals;
import ng.com.bitsystems.mis.models.transactions.Service;
import ng.com.bitsystems.mis.models.transactions.Transaction;
import ng.com.bitsystems.mis.models.users.Users;
import ng.com.bitsystems.mis.models.vaccination.Vaccinations;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class VaccinationTransactionsDetails extends Service {
     VaccinationTransaction vaccinationTransaction;
     Vaccinations vaccinations;
}


