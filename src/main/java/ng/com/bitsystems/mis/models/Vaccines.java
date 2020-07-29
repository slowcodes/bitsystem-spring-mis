package ng.com.bitsystems.mis.models;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Vaccines  extends BaseEntity {

     private LaboratoryInvestigations laboratoryInvestigations;
     private Integer vaccineId;
     private Integer noOfDoses;
     private String frequency;
     private Integer noFrequency;
     private Integer duration;

}


