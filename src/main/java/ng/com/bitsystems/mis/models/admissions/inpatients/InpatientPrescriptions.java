package ng.com.bitsystems.mis.models.admissions.inpatients;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
public class InpatientPrescriptions extends Prescription {

     @ManyToOne
     @JoinColumn(name = "inpatientadmission_id")
     private InpatientAdmission inpatientAdmission;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "inpatientPrecriptions")
     private Set<InpatientPrescriptionSchedule> inpatientPrescriptionSchedules;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "inpatientPrescriptions")
     private Set<InpatientPrescriptionAdministration> inpatientPrescriptionAdministrations = new HashSet<>();

     @ManyToOne
     @JoinColumn(name = "pharmacyproduct_id")
     private PharmacyProducts pharmacyProducts;
}


