package ng.com.bitsystems.mis.models.rewards.loyalties;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.patients.Patients;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientsLoyaltyGains  extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "patients_id")
     private Patients patients;

     @ManyToOne
     @JoinColumn(name = "patientsloyaltyactivities_id")
     private PatientsLoyaltyActivites patientsLoyaltyActivites;

     private Integer redemption;
     private LocalDate date;

}


