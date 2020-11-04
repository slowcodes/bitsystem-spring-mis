package ng.com.bitsystems.mis.models.laboratories;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Packages extends BaseEntity {

     private String packageName;
     private Double discount;
     private String packageDesc;

     @ManyToMany(mappedBy = "packages")
     private Set<LaboratoryInvestigations> laboratoryInvestigations = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "packages")
    private Set<LaboratoryTransactionDetail> laboratoryTransactionDetails = new HashSet<>();

    public Packages addLanTxnDetail(LaboratoryTransactionDetail transaction) {
        laboratoryTransactionDetails.add(transaction);
        transaction.setPackages(this);
        return this;
    }
}


