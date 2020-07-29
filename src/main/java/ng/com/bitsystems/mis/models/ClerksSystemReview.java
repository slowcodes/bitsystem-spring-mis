package ng.com.bitsystems.mis.models;



import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ClerksSystemReview  extends BaseEntity {

     private Clerks clerks;
     private InternalOrgansDirectory internalOrgansDirectory;
     private String review;
}


