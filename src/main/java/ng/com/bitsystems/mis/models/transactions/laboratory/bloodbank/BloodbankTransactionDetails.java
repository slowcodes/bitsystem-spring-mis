package ng.com.bitsystems.mis.models.transactions.laboratory.bloodbank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Storage;
import ng.com.bitsystems.mis.models.transactions.ProductPrice;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BloodbankTransactionDetails extends ProductPrice {

     @ManyToOne
     @JoinColumn(name = "storage_id")
     private Storage storage;

     @ManyToOne
     @JoinColumn(name = "bloodbanktransaction_id")
     private BloodbankTransaction bloodbanktransaction;

}


