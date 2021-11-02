package ng.com.bitsystems.mis.models.consultation;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


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
public class ClerkingSymptoms extends BaseEntity {

     @ManyToOne
     @JoinColumn(name = "symptomsdirectory_id")
     private SymptomsDirectory symptomsDirectory;

     private Integer degree; //{0-10:0-very low, 10-very high }

     @ManyToOne
     @JoinColumn(name = "clerks_id")
     private Clerks clerks;

}


