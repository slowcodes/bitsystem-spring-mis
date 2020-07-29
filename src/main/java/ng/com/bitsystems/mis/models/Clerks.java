package ng.com.bitsystems.mis.models;
// Generated Jun 24, 2020 12:32:32 AM by Hibernate Tools 4.3.1


import lombok.*;

import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Clerks  extends BaseEntity {

     private Patients patients;
     private Users users;
     private Date clerkDate;
     private String hpc;
     private String provisionalDiagnosis;
     private String observations;
     private String pharmacyTid;
     private String tid;
     private String radiologyTid;
     private String laboratoryTid;
     private Set clerksSymptomses = new HashSet(0);
     private Set symptomsClerkings = new HashSet(0);
     private Set clerksPcHistories = new HashSet(0);
     private Set clerksSystemReviews = new HashSet(0);

}


