package ng.com.bitsystems.mis.models;


import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ClerksSymptoms  extends BaseEntity {

     private Clerks clerks;
     private SymptomsDirectory symptomsDirectory;
     private Integer degree;

}


