package ng.com.bitsystems.mis.models.consultation;


import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InternalOrganReview extends BaseEntity {

     private PatientConsultationClerkingSymptoms patientConsultationClerkingSymptoms;
     private InternalOrgansDirectory internalOrgansDirectory;
     private Integer review;

}


