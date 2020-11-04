package ng.com.bitsystems.mis.models.transactions.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.transactions.Sales;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class PharmacySupplyTransactionsDetails extends Sales {

     @ManyToOne
     @JoinColumn(name = "supplyTransaction_id")
     private PharmacySupplyTransactions pharmacySupplyTransactions;

     private Double qty;

     @ManyToOne
     @JoinColumn(name = "pharmacyproducts_id")
     private PharmacyProducts pharmacyProducts;


     private String batchNumber;
     private String comment;
     private LocalDate expiryDate;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "pharmacySupplyTransactionDetails")
     private Set<AdditionalTransactionDetails> additionalTransactionDetails = new HashSet<>();

}


