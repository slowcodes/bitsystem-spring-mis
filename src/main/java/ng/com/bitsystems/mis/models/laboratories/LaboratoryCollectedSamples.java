package ng.com.bitsystems.mis.models.laboratories;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.LaboratoryTransactions;
import ng.com.bitsystems.mis.models.users.Users;

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


