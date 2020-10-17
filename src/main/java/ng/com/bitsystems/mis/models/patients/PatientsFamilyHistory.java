package ng.com.bitsystems.mis.models.patients;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PatientsFamilyHistory  extends BaseEntity{

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientFamilyHistory")
     private Set<DiseaseDirectory> diseaseDirectorySet = new HashSet<>();

     @ManyToOne
     @JoinColumn(name = "patientsfamily_id")
     private FamilyFolder familyFolder;

     @ManyToOne
     @JoinColumn(name = "users_id")
     private Users users;

     private LocalDate dateRecorded;

}


