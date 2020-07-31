package ng.com.bitsystems.mis.models.admissions.facilities;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.accounts.pricing.Rate;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Wards extends Facilities {
     private Rate rate;
     private Set admissionBedses = new HashSet(0);
}


