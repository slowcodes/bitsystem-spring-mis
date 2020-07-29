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
public class VaccineMedicationLogs extends BaseEntity {

     private VaccineMedication vaccineMedication;
     private Date timeOfAdministration;
     private String administeredBy;

}


