package ng.com.bitsystems.mis.models.patients;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientsMedicalFileAttachment  extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "patients_id")
     private Patients patients;

     private byte[] medicalFile;

     private String description;

     @ManyToOne
     @JoinColumn(name= "user_id")
     private Physicians physicians;
}


