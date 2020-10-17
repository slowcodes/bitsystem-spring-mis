package ng.com.bitsystems.mis.models.transactions.laboratory;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.payments.insurance.InsuredLaboratoryTransactions;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LaboratoryTransaction extends Transaction {

     private String presentingComplaint;
     private String provisonalDiagnosis;

     @OneToMany(cascade = CascadeType.ALL, mappedBy = "laboratoryTransaction")
     private Set<LaboratoryTransactionDetail> laboratoryTransactionDetails = new HashSet<>();

     @OneToOne
     private InsuredLaboratoryTransactions insuredLaboratoryTransactions;
}


