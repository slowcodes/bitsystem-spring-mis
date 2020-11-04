package ng.com.bitsystems.mis.models.transactions.laboratory;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.laboratories.ExperimentReadings;
import ng.com.bitsystems.mis.models.laboratories.LaboratoryInvestigations;
import ng.com.bitsystems.mis.models.laboratories.Packages;
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

//     @OneToOne
//     private SampleCollectionQueue sampleCollectionQueue;
//
//     @OneToOne
//     private CollectedSamples collectedSamples;

     @ManyToOne
     @JoinColumn(name = "packageId")
     private Packages packages;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "laboratoryTransactionDetail")
     private Set<ExperimentReadings> experimentResultsByParameters = new HashSet<>();

    public LaboratoryTransactionDetail addExperimentReading(ExperimentReadings experimentReadings) {
         this.experimentResultsByParameters.add(experimentReadings);
         experimentReadings.setLaboratoryTransactionDetail(this);
         return this;
    }
}

