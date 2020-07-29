package ng.com.bitsystems.mis.models;
import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LaboratoryInvestigationParameters  extends BaseEntity {

     private LabaratoryInvestigationResultByParams labaratoryInvestigationResultByParams;
     private String variableName;
     private String value;

}


