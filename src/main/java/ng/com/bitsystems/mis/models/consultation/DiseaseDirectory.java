package ng.com.bitsystems.mis.models.consultation;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.admissions.CarePlans;
import ng.com.bitsystems.mis.models.admissions.TreatmentPlans;
import ng.com.bitsystems.mis.models.patients.FamilyFolder;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransaction;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DiseaseDirectory extends BaseEntity {
     private String ICD_10_Code;
     private String ICD_10_Code_Dotnotation;
     private String ICD_10_Description;
     private String ICD_9_Code;
     private String ICD_9_Code_Dotnotation;
     private String ICD_9_Description;
     private String DSM_4_Axis;
     private String Approximate;
     private String Nomap;
     private String Combination;
     private String Scenario;
     private String Choicelist;
     private String DX_CAT;
     @Lob
     @Column(length = 512)
     private String Termsearch;
     private LocalDateTime Effdt;
     @CreationTimestamp
     private LocalDateTime Enddt;

     @ManyToMany(mappedBy = "diseaseDirectory")
     private Set<FamilyFolder> familyHistory = new HashSet<>();

     @ManyToMany(mappedBy = "provisional_diagnosis")
     private Set<LaboratoryTransaction> labTxn = new HashSet<>();

     @ManyToMany(mappedBy = "diseaseDirectory")
     private Set<TreatmentPlans> treatmentPlans = new HashSet<>();

     @ManyToMany(mappedBy = "diseaseDirectory")
     private Set<CarePlans> carePlans = new HashSet<>();
}


