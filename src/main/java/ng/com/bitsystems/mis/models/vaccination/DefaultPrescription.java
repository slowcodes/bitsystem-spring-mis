package ng.com.bitsystems.mis.models.vaccination;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.Prescription;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DefaultPrescription extends Prescription {

     @ManyToOne
     @JoinColumn(name = "vaccine_id")
     private Vaccines vaccines;

     private Integer maxAge;
     private Integer minAge;
}


