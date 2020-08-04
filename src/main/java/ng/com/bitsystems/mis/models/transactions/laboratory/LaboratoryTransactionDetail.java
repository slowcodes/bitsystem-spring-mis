package ng.com.bitsystems.mis.models.transactions.laboratory;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.laboratories.*;
import ng.com.bitsystems.mis.models.transactions.Service;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LaboratoryTransactionDetail extends Service {
     @ManyToOne
     @JoinColumn(name = "laboratoryinvestigation_id")
     private LaboratoryInvestigations laboratoryInvestigations;

     @ManyToOne
     @JoinColumn(name = "laboratorytransaction_id")
     private LaboratoryTransaction laboratoryTransaction;

     @OneToOne
     private PendingSampleCollection pendingSampleCollection;

     @OneToOne
     private CollectedSamples collectedSamples;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "laboratoryTransactionDetail")
     private Set<ObservationQueue> observationQueues = new HashSet<>();

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "laboratoryTransactionDetail")
     private Set<ExperimentResultsByParameters> experimentResultsByParameters = new HashSet<>();
}

