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
public class PharmacyPrescriptions  extends BaseEntity {

     private PharmacyStock pharmacyStock;
     private String transactionId;
     private Date appropriateAdministrationTime;
     private int interval;
     private int frequency;
     private int dose;
     private String measure;

}


