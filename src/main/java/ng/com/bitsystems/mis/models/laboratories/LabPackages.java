package ng.com.bitsystems.mis.models.laboratories;
// Generated Jul 29, 2020 6:59:27 PM by Hibernate Tools 4.3.1


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.laboratory.LaboratoryTransactionDetail;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LabPackages extends BaseEntity {

     private String packageName;
     private Double discount;
     private String packageDesc;


     @ManyToMany(cascade = {CascadeType.ALL})
     @JoinTable(name = "lab_package_detail",
             joinColumns = {@JoinColumn(name = "package_id")},
             inverseJoinColumns = {@JoinColumn(name = "lab_id")}
             )
     private Set<Investigations> investigations = new HashSet<>();

    public LabPackages addTxnDetail(LaboratoryTransactionDetail transaction) {
        return this;
    }

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "packages")
//    private Set<LaboratoryTransactionDetail> laboratoryTransactionDetails = new HashSet<>();
//
//    public LabPackages addLanTxnDetail(LaboratoryTransactionDetail transaction) {
//        laboratoryTransactionDetails.add(transaction);
//        transaction.setLabPackages(this);
//        return this;
//    }
}


