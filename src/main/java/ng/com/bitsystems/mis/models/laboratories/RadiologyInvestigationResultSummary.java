package ng.com.bitsystems.mis.models.laboratories;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

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
public class RadiologyInvestigationResultSummary  extends BaseEntity {

     private RadiologyInvestigationQueue radiologyInvestigationQueue;
     private int user;
     private String footNote;
     private Date logTime;
     private String resultNote;
     private String commentColor;
     private String signatoryColor;
     private Set radiologyInvestigationResultVerifieds = new HashSet(0);


}


