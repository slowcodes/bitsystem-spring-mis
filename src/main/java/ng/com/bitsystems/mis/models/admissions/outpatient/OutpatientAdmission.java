package ng.com.bitsystems.mis.models.admissions.outpatient;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.admissions.Admission;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OutpatientAdmission  extends Admission {

     @OneToOne
     private OutpatientAdmissionDischarged outpatientAdmissionDischarged;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "outpatientAdmission")
     private Set<OutpatientPrescriptions> outpatientPrescriptions = new HashSet<>();

     public OutpatientAdmission addInpatientPrescription(OutpatientPrescriptions outpatientPrescriptions) {
          this.outpatientPrescriptions.add(outpatientPrescriptions);
          outpatientPrescriptions.setOutpatientAdmission(this);
          return this;
     }

}


