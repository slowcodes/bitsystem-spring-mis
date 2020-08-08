package ng.com.bitsystems.mis.models.admissions.outpatient;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.admissions.inpatients.InpatientAdmission;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.pharmacy.Prescription;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OutpatientPrescriptions extends Prescription {

     @ManyToOne
     @JoinColumn(name = "outpatientadmission_id")
     private InpatientAdmission inpatientAdmission;

     @OneToOne
     private OutpatientPrescriptionSchedule outpatientPrescriptionSchedule;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "outpatientPrescriptions")
     private Set<OutpatientPrescriptionAdministration> outpatientPrescriptionAdministrations = new HashSet<>();

     @ManyToOne
     @JoinColumn(name = "pharmacyproduct_id")
     private PharmacyProducts pharmacyProducts;
}


