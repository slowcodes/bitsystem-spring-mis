package ng.com.bitsystems.mis.models.transactions.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.transactions.Service;

import javax.persistence.Entity;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class PharmacyTransactionsSupplies  extends Service {
     private Double qty;
     private PharmacyProducts pharmacyProducts;
     private String batchNumber;
     private String comment;
     private Date expiryDate;

}


