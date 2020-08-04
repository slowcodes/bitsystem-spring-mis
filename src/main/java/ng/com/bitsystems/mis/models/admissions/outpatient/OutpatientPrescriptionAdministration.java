package ng.com.bitsystems.mis.models.admissions.outpatient;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OutpatientPrescriptionAdministration extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "users_id")
     private Users users;

     private LocalDateTime administrationTime;

     @ManyToOne
     @JoinColumn(name = "outpatientpharmacyprescription_id")
     private OutpatientPharmacyPrescriptions outpatientPharmacyPrescriptions;

     private String commentObservation;
}


