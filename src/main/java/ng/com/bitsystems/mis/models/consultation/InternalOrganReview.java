package ng.com.bitsystems.mis.models.consultation;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InternalOrganReview extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "internalorgansdirectory_id")
     private InternalOrgansDirectory internalOrgansDirectory;

     private Integer state; //0-10, 10-Perfect condition, 0 very bad condition
     private String review;

     @ManyToOne
     @JoinColumn(name = "clerkId")
     private Clerks clerks;
}


