package ng.com.bitsystems.mis.models.patients;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientsMedicalActivityListing  extends BaseEntity {

     private String medicalActivity;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "")
     private Set<PatientsMedicalHistory> patientsMedicalHistories = new HashSet<>();

}


