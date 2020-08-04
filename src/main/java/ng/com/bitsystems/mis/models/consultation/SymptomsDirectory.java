package ng.com.bitsystems.mis.models.consultation;


import lombok.Getter;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
public class SymptomsDirectory extends BaseEntity {

     private String symptoms;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "symptomsDirectory")
     private Set<ClerkingSymptoms> clerkingSymptoms = new HashSet<>();

}


