package ng.com.bitsystems.mis.models.patients;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientsMedicalHistory  extends BaseEntity {
     @ManyToOne
     @JoinColumn(name = "patients_id")
     private Patients patients;

     @Enumerated(value = EnumType.STRING)
     private MedicalActivity medicalActivity;

     private LocalDate dateRecorded;

     private byte[] attachment;

     private String note;
}


