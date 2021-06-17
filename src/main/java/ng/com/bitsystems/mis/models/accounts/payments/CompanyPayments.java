package ng.com.bitsystems.mis.models.accounts.payments;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.patients.CompanyFolder;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CompanyPayments extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "transaction_id")
    private Transaction transaction;


    @OneToOne
    private CompanyFolder company;
}
