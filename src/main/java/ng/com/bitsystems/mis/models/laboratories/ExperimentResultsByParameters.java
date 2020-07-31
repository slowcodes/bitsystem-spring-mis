package ng.com.bitsystems.mis.models.laboratories;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryServiceTransactionDetail;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ExperimentResultsByParameters extends BaseEntity {

     private ExperimentResultParameters experimentResultParameters;
     private LaboratoryServiceTransactionDetail laboratoryTransactionDetail;
     private String valueOfParameter;
     private String color;
     private Set laboratoryInvestigationParameterses = new HashSet(0);

}


