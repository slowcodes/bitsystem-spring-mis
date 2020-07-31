package ng.com.bitsystems.mis.models.laboratories;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryServiceTransactionDetail;
import ng.com.bitsystems.mis.models.users.Users;

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
public class CollectedSamples extends BaseEntity {

     private LaboratoryServiceTransactionDetail laboratoryTransactionDetail;
     private Users users;
     private String sampleType;
     private Integer analysed;
     private Date dateOfCollection;
     private Set<ExperimentResultsByParameters> experimentResultsByParams = new HashSet<>();
}


