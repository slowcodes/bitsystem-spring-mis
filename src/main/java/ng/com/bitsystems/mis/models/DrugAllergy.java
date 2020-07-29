package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class DrugAllergy  extends BaseEntity {

     private Patients patients;
     private PharmacyStock pharmacyStock;
     private String tolerance;

}


