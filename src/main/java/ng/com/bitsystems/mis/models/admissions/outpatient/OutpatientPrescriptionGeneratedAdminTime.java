package ng.com.bitsystems.mis.models.admissions.outpatient;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1



/**
 * OutpatientPrescriptionGeneratedAdminTime generated by hbm2java
 */

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
public class OutpatientPrescriptionGeneratedAdminTime  extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "outpatientprescriptionschedule_id")
     private OutpatientPrescriptionSchedule outpatientPrescriptionSchedule;

     private LocalDateTime extimatedAdminTime;

     private String comment;

}

