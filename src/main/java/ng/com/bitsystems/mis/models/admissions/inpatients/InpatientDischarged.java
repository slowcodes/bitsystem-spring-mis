package ng.com.bitsystems.mis.models.admissions.inpatients;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.admissions.Discharged;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InpatientDischarged extends Discharged {

     private InpatientAdmission inpatientAdmission;

}


