package ng.com.bitsystems.mis.models.admissions.facilities;
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
public class Beds extends BaseEntity {

     private Set inpatientAdmissions = new HashSet(0);
     private BedCategory bedCategory;
}


