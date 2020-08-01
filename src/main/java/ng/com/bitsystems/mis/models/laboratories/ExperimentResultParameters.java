package ng.com.bitsystems.mis.models.laboratories;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ExperimentResultParameters extends BaseEntity {

     private ExperimentResultParameters experimentResultParameters;
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


