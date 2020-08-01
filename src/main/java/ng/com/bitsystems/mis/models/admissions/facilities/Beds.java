package ng.com.bitsystems.mis.models.admissions.facilities;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.Rate;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Beds extends BaseEntity {

     private Set inpatientAdmissions = new HashSet(0);
     private BedCategory bedCategory;
     private Rate rate;
}


