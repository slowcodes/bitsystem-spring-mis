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
public class LaboratoryInvestigations  extends BaseEntity {

     private LaboratoryInvestigationGroups laboratoryInvestigationGroups;
     private PricingCode pricingCode;
     private String testTitle;
     private String labTestDesc;
     private Set vaccineMedications = new HashSet(0);
     private Set inventorySetSampleCollections = new HashSet(0);
     private Set packageDetailses = new HashSet(0);
     private Set laboratoryInvestigationResultParameterses = new HashSet(0);
     private Set vaccineShedulesDetailses = new HashSet(0);
     private Vaccines vaccines;


}


