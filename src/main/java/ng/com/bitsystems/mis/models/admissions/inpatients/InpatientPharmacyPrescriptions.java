package ng.com.bitsystems.mis.models.admissions.inpatients;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.Prescription;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InpatientPharmacyPrescriptions  extends Prescription {

     private InpatientAdmission inpatientAdmission;
     private Set inpatientPrescriptionSchedules = new HashSet(0);
     private Set inpatientPrescriptionActualAdminTimes = new HashSet(0);

}


