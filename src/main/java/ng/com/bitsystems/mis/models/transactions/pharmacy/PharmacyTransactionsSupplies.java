package ng.com.bitsystems.mis.models.transactions.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.transactions.Service;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class PharmacyTransactionsSupplies  extends Service {

     @ManyToOne
     @JoinColumn(name = "supplyTransaction_id")
     private SupplyTransactions supplyTransactions;

     private Double qty;

     @ManyToOne
     @JoinColumn(name = "pharmacyproducts_id")
     private PharmacyProducts pharmacyProducts;

     private String batchNumber;
     private String comment;
     private LocalDate expiryDate;

}


