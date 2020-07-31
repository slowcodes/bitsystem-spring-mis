package ng.com.bitsystems.mis.models.transactions.laboratory;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigations;
import ng.com.bitsystems.mis.models.laboratories.ObservationQueue;
import ng.com.bitsystems.mis.models.transactions.Service;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LaboratoryServiceTransactionDetail extends Service {

     private LaboratoryInvestigations laboratoryInvestigations;
     private LaboratoryTransaction laboratoryTransaction;
     private Set laboratoryPendingSampleCollections = new HashSet(0);
     private Set laboratoryCollectedSampleses = new HashSet(0);
     private Set<ObservationQueue> observationQueues = new HashSet<>();

}


