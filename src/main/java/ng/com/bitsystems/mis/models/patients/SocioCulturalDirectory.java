package ng.com.bitsystems.mis.models.patients;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SocioCulturalDirectory extends BaseEntity {
     private String activity;

     @ManyToMany(mappedBy = "socialHistory")
     private Set<Patients> patients = new HashSet<>();
}


