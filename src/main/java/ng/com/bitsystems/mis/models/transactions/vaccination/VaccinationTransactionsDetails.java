package ng.com.bitsystems.mis.models.transactions.vaccination;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.pharmacy.Prescription;
import ng.com.bitsystems.mis.models.transactions.ServiceTransaction;
import ng.com.bitsystems.mis.models.vaccination.Vaccines;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VaccinationTransactionsDetails extends BaseEntity {

     @ManyToOne()
     @JoinColumn(name = "vaccinationtransaction_id")
     private VaccinationTransaction vaccinationTransaction;

     @ManyToOne
     @JoinColumn(name = "vaccinations_id")
     private Vaccines vaccine;

     @ManyToMany()
     @JoinTable(name = "vaccine_prescription",
             joinColumns = @JoinColumn(name = "txn_detail_id"),
             inverseJoinColumns = @JoinColumn(name = "prescription_id"))
     private Set<Prescription> prescriptions = new HashSet<>();

     @OneToOne
     private ServiceTransaction serviceTransaction;
}


