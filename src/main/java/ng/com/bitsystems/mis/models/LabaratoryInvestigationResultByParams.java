package ng.com.bitsystems.mis.models;
import lombok.*;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LabaratoryInvestigationResultByParams extends BaseEntity {


     private LaboratoryInvestigationResultParameters laboratoryInvestigationResultParameters;
     private LaboratoryTransactions laboratoryTransactions;
     private String valueOfParameter;
     private String color;
     private Set laboratoryInvestigationParameterses = new HashSet(0);

}


