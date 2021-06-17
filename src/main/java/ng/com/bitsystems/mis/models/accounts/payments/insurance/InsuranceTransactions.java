package ng.com.bitsystems.mis.models.accounts.payments.insurance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.transactions.Transaction;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InsuranceTransactions extends BaseEntity {


    @ManyToOne
    @JoinColumn(name="programs_id")
    private Programs programs;

    @Column(name="percentage_incured")
    private Double percentageIncured;

    @OneToOne
    private Transaction transaction;
}
