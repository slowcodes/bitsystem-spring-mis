package ng.com.bitsystems.mis.models.consultation;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InternalOrganReview extends BaseEntity {

     private ClerkingSymptoms clerkingSymptoms;
     private InternalOrgansDirectory internalOrgansDirectory;
     private Integer review;

}


