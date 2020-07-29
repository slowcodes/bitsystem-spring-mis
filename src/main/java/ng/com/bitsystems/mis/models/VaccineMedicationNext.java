package ng.com.bitsystems.mis.models;

import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class VaccineMedicationNext  extends BaseEntity {

     private VaccineMedication vaccineMedication;
     private Integer hr;
     private Integer day;
     private Integer month;
     private Integer yr;

}


