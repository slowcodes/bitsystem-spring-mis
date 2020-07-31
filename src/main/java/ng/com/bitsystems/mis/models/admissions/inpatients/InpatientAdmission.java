package ng.com.bitsystems.mis.models.admissions.inpatients;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.*;
import ng.com.bitsystems.mis.models.admissions.facilities.Beds;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InpatientAdmission extends ng.com.bitsystems.mis.models.admissions.Admission {

     private Beds admissionBed;
     private String presentingComplaint;
     private String provisionalDiagnosis;
     private Set inpatientAdmissionDischargeds = new HashSet(0);
     private Set inpatientPharmacyPrescriptionses = new HashSet(0);

}


