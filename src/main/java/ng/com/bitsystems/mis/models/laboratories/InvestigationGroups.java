package ng.com.bitsystems.mis.models.laboratories;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InvestigationGroups extends BaseEntity {

     @OneToOne
     private Laboratories laboratories;

     private String grpName;

     @OneToMany(mappedBy = "investigationGroups")
     private Set<LaboratoryInvestigations> laboratoryInvestigations = new HashSet<>();
}


