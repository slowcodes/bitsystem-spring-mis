package ng.com.bitsystems.mis.models;

import lombok.*;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class LaboratoryCollectedSamples  extends BaseEntity {

     private LaboratoryTransactions laboratoryTransactions;
     private Users users;
     private String sampleType;
     private Integer analysed;
     private Date dateOfCollection;


}


