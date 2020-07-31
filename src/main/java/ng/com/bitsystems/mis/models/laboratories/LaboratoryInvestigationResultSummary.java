package ng.com.bitsystems.mis.models.laboratories;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


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
public class LaboratoryInvestigationResultSummary  extends BaseEntity {

     private int user;
     private int sampleCollectionId;
     private String footNote;
     private Date logTime;
     private String comment;
     private String commentColor;
     private String signatoryColor;
     private Set laboratoryInvestigationResultVerifieds = new HashSet(0);
     private Set laboratoryInvestigationResultCollectionLogses = new HashSet(0);


}


