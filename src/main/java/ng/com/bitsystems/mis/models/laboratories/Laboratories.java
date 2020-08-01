package ng.com.bitsystems.mis.models.laboratories;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Laboratories  extends BaseEntity {
     private String labName;
     private String description;
     private Set laboratoryInvestigationGroupses = new HashSet(0);
     private Set radialogyInvestigationGroupses = new HashSet(0);
}


