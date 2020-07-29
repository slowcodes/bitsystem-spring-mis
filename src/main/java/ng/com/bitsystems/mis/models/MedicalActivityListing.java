package ng.com.bitsystems.mis.models;

import lombok.*;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class MedicalActivityListing  extends BaseEntity {


     private String medicalActivity;
     private Set patientsMedicalHistories = new HashSet(0);

}


