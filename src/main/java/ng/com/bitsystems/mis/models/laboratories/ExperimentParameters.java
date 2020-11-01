package ng.com.bitsystems.mis.models.laboratories;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ExperimentParameters extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "laboratoryinvestigations_id")
     private LaboratoryInvestigations laboratoryInvestigations;

     private String parameter;
     private String valueDataType;
     private Double min;
     private Double max;
     private Integer presentation;
     private String unit;

//     @ManyToOne
//     @JoinColumn(name = "laboratorytransactiondetail_id")
//     private LaboratoryTransactionDetail laboratoryTransactionDetail;

}


