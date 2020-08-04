package ng.com.bitsystems.mis.models.patients;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientDrugAllergy  extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "patients_id")
     private Patients patients;

     @ManyToOne
     @JoinColumn(name = "pharmacyproducts_id")
     private PharmacyProducts pharmacyProducts;

     private Integer toleranceLevel; //On a scale of 0-10: O cannot tolerate

}


