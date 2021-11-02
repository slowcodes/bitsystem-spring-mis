package ng.com.bitsystems.mis.models.laboratories;

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
public class Laboratories  extends BaseEntity {

     private String labName;
     private String description;

//     @OneToMany(cascade = CascadeType.ALL, mappedBy = "laboratories")
//     private Set<InvestigationGroups> investigationGroups=new HashSet<>();

}