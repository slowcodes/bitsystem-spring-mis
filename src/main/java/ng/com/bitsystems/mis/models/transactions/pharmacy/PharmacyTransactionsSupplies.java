package ng.com.bitsystems.mis.models.transactions.pharmacy;

import lombok.*;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.transactions.Service;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PharmacyTransactionsSupplies  extends Service {
     private Double qty;
     private PharmacyProducts pharmacyProducts;
     private String batchNumber;
     private String comment;
     private Date expiryDate;

}


