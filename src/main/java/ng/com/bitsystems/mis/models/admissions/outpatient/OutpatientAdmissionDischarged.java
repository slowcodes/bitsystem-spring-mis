package ng.com.bitsystems.mis.models.admissions.outpatient;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1

import lombok.*;
import ng.com.bitsystems.mis.models.admissions.Discharged;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class OutpatientAdmissionDischarged  extends Discharged {

     private OutpatientAdmission outpatientAdmission;

}


