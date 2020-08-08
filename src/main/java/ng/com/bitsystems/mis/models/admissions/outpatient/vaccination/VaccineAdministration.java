package ng.com.bitsystems.mis.models.admissions.outpatient.vaccination;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.PrecriptionAdministration;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VaccineAdministration extends PrecriptionAdministration {

     @ManyToOne
     @JoinColumn(name = "vaccinationprescription_id")
     private VaccinationPrescriptions vaccinationPrescriptions;
}


