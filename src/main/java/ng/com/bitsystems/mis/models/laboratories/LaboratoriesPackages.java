package ng.com.bitsystems.mis.models.laboratories;
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
public class LaboratoriesPackages  extends BaseEntity {
     private String packageName;
     private Double discount;
     private String packageDesc;
     private Set radiologyPackageDetailses = new HashSet(0);
     private Set laboratoryPackageDetailses = new HashSet(0);

}


