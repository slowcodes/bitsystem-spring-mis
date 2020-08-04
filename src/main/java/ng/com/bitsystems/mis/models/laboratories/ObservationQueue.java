package ng.com.bitsystems.mis.models.laboratories;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ObservationQueue extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "laboratorytransactiondetail_id")
     private LaboratoryTransactionDetail laboratoryTransactionDetail;

     @ManyToOne
     @JoinColumn(name = "laboratorypackagedatils_id")
     private LaboratoryPackageDetails laboratoryPackageDetails;
     private LocalDate scheduledTime;
     private Integer status;

}


