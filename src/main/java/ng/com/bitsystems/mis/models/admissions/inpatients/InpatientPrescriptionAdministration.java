package ng.com.bitsystems.mis.models.admissions.inpatients;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.PrescriptionAdministration;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InpatientPrescriptionAdministration extends PrescriptionAdministration {

     @ManyToOne
     @JoinColumn(name = "inpatientprescriptions_id")
     private InpatientPrescriptions inpatientPrescriptions;

}


