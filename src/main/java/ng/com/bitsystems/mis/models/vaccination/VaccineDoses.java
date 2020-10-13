package ng.com.bitsystems.mis.models.vaccination;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.GeneratedAdministration;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VaccineDoses extends GeneratedAdministration {

     @ManyToOne
     @JoinColumn(name = "vaccineSchedule_id")
     private VaccineSchedule vaccineSchedule;

}


