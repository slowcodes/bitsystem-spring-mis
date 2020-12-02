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
     private LaboratoryTransactionDetail laboratoryTransactionDetail;

     @ManyToOne
     @JoinColumn(name = "package_id")
     private Packages packages;

     private LocalDate scheduledTime;
     private Integer status;

     @ManyToOne
     @JoinColumn
     private LaboratoryPackageDetails laboratoryPackageDetails;

}


