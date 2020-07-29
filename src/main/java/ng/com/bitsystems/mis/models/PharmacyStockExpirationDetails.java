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
public class PharmacyStockExpirationDetails  extends BaseEntity {


     private Date expiryDate;
     private Date manufactureDate;
     private Integer pharmacyStockId;
     private String batchCode;

}


