package ng.com.bitsystems.mis.models.transactions.laboratory;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.laboratories.Queue;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LaboratoryTransactionDetail extends BaseLabTxnDetail {

     @OneToOne(cascade = CascadeType.PERSIST)
     private Queue queue;

     //@JsonIgnore
     @ManyToOne(fetch = FetchType.EAGER)
     @JoinColumn(name = "laboratoryTransactionId")
     private LaboratoryTransaction laboratoryTransaction;
}