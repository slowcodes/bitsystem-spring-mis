package ng.com.bitsystems.mis.models.consultation;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PatientConsultationClerkingSymptoms  extends BaseEntity {

     private SymptomsDirectory symptomsDirectory;
     private Clerks clerks;
     private Integer degree;
     private Set patientConsultationOrganReviews = new HashSet(0);

}


