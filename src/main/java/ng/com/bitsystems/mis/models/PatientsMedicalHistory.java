package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PatientsMedicalHistory extends BaseEntity {

     private MedicalActivityListing medicalActivityListing;
     private Patients patients;
     private Users users;
     private Date dateRecorded;

}


