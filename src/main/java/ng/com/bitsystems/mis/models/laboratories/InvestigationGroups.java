package ng.com.bitsystems.mis.models.laboratories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InvestigationGroups extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "lab_id")
     private Laboratories laboratories;

     private String grpName;

     @OneToMany
     @JoinColumn(name = "inv_grp_id")
     private Set<Investigations> investigations = new HashSet<>();

//
//     public InvestigationGroups addlabInvestigation(Investigations investigations) {
//          this.investigations.add(investigations);
//          investigations.setInvestigationGroups(this);
//          return this;
//     }
}


