package ng.com.bitsystems.mis.models.transactions.laboratory;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.consultation.DiseaseDirectory;
import ng.com.bitsystems.mis.models.consultation.SymptomsDirectory;
import ng.com.bitsystems.mis.models.transactions.ServiceTransaction;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LaboratoryTransaction extends BaseEntity {


     @ManyToMany
     @JoinTable(name = "lab_txn_complaints_symptoms",
            joinColumns = @JoinColumn(name = "lab_txn_id"),
            inverseJoinColumns = @JoinColumn(name = "symptom_id"))
     private Set<SymptomsDirectory> symptoms = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "lab_txn_provisional_diagnosis",
            joinColumns = @JoinColumn(name = "lab_txn_id"),
            inverseJoinColumns = @JoinColumn(name = "dieases_id"))
    private Set<DiseaseDirectory> provisional_diagnosis = new HashSet<>();

    @OneToMany(mappedBy = "laboratoryTransaction", cascade = CascadeType.ALL)
    private Set<LaboratoryTransactionDetail> laboratoryTransactionDetails = new HashSet<>();

    @OneToOne
    private ServiceTransaction serviceTransaction;

    private Integer ageInResult;
    private Integer anonymous;

    public LaboratoryTransaction addLabTnxDetail(LaboratoryTransactionDetail transaction) {
        laboratoryTransactionDetails.add(transaction);
        transaction.setLaboratoryTransaction(this);
        return this;
    }
}


