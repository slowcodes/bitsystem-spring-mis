package ng.com.bitsystems.mis.models.consultation;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InternalOrgansDirectory extends BaseEntity {
     private String system;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "internalOrgansDirectory")
     private Set<InternalOrganReview> internalOrganReviews = new HashSet<>();
}


