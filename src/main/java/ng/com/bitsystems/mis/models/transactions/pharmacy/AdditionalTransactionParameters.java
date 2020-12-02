package ng.com.bitsystems.mis.models.transactions.pharmacy;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AdditionalTransactionParameters extends BaseEntity {

     private String parameter;
     private String description;
     private String dataType;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "transactionParameters")
     private Set<AdditionalSupplyTransactionDetails> additionalSupplyTransactionDetails = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "transactionParameters")
    private Set<AdditionalSaleTransactionDetails> additionalSaleTransactionDetails = new HashSet<>();

    public AdditionalTransactionParameters addSupplyTxnDetail(AdditionalSupplyTransactionDetails details) {
        additionalSupplyTransactionDetails.add(details);
        details.setTransactionParameters(this);
        return this;
    }

    public AdditionalTransactionParameters addSalesTxnDetail(AdditionalSaleTransactionDetails details) {
        additionalSaleTransactionDetails.add(details);
        details.setTransactionParameters(this);
        return this;
    }
}


