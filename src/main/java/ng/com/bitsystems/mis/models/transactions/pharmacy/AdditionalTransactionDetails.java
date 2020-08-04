package ng.com.bitsystems.mis.models.transactions.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AdditionalTransactionDetails extends BaseEntity{

     @ManyToOne
     @JoinColumn(name = "pharmacytransactiondetails_id")
     private PharmacyTransactionDetails pharmacyTransactionDetails;

     @ManyToOne
     @JoinColumn(name = "additionaltransactionparameters_id")
     private AdditionalTransactionParameters transactionParameters;

     private Integer showInReciept;
     private String value;
}


