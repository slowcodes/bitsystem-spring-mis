package ng.com.bitsystems.mis.models.admissions.inpatients;

import lombok.*;
import ng.com.bitsystems.mis.models.admissions.Discharged;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InpatientDischarged extends Discharged {

     private InpatientAdmission inpatientAdmission;

}


