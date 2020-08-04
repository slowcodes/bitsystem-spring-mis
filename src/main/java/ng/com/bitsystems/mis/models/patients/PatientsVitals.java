package ng.com.bitsystems.mis.models.patients;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientsVitals  extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "patients_id")
     private Patients patients;

     private Double height;
     private String bloodPresure;
     private String pulseRate;
     private Double weight;
     private String bloodSugar;
     private Double tempreture;
     private LocalDateTime localDateTime;

}


