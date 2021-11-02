package ng.com.bitsystems.mis.models.laboratories;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ExperimentReadings extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "experimentparamenters_id")
     private ExperimentParameters experimentParameters;

     @ManyToOne
     @JoinColumn(name = "laboratoryservicetransactiondetails_id")
     private LaboratoryTransactionDetail laboratoryTransactionDetail;

     private String valueOfParameter;
     private String color;

     @ManyToOne
     @JoinColumn(name="collectedsamples_id")
     private CollectedSamples collectedSamples;
}


