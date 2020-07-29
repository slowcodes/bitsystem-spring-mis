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
public class LaboratoryInvestigationResultParameters  extends BaseEntity {


     private LaboratoryInvestigationResultParameters laboratoryInvestigationResultParameters;
     private LaboratoryInvestigations laboratoryInvestigations;
     private String parameter;
     private String valueDataType;
     private Double min;
     private Double max;
     private Integer presentation;
     private String unit;
     private Set laboratoryInvestigationResultParameterses = new HashSet(0);
     private Set labaratoryInvestigationResultByParamses = new HashSet(0);


}


