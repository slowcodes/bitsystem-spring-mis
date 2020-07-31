package ng.com.bitsystems.mis.models.patients;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import ng.com.bitsystems.mis.models.BaseEntity;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class PatientsMedicalActivityListing  extends BaseEntity {


     private Integer id;
     private String medicalActivity;
     private Set patientsMedicalHistories = new HashSet(0);

    public PatientsMedicalActivityListing() {
    }

    public PatientsMedicalActivityListing(String medicalActivity, Set patientsMedicalHistories) {
       this.medicalActivity = medicalActivity;
       this.patientsMedicalHistories = patientsMedicalHistories;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMedicalActivity() {
        return this.medicalActivity;
    }
    
    public void setMedicalActivity(String medicalActivity) {
        this.medicalActivity = medicalActivity;
    }
    public Set getPatientsMedicalHistories() {
        return this.patientsMedicalHistories;
    }
    
    public void setPatientsMedicalHistories(Set patientsMedicalHistories) {
        this.patientsMedicalHistories = patientsMedicalHistories;
    }




}


