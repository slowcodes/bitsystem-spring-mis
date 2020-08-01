package ng.com.bitsystems.mis.models.consultation;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.users.Users;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class DiseaseDirectory extends BaseEntity {

     private Users users;
     private String disease;
     private String description;
     private Set patientsFamilyHistories = new HashSet(0);

}


