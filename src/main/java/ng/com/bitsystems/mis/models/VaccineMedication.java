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
public class VaccineMedication  extends BaseEntity {


     private Integer id;
     private LaboratoryInvestigations laboratoryInvestigations;
     private PharmacyStock pharmacyStock;
     private String measure;
     private Double quantity;
     private String modeOfAdministration;
     private Set vaccineMedicationNexts = new HashSet(0);
     private Set vaccineMedicationLogses = new HashSet(0);



}


