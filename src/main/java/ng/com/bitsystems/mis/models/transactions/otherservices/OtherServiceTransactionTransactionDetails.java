package ng.com.bitsystems.mis.models.transactions.otherservices;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.OtherServices;
import ng.com.bitsystems.mis.models.transactions.ServiceTransaction;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class OtherServiceTransactionTransactionDetails extends BaseEntity {

    @ManyToOne
    private OtherServices otherService;

    @ManyToOne(cascade = CascadeType.ALL)
    private OtherServiceTransaction otherServiceTransaction;

    @OneToOne
    private ServiceTransaction serviceTransaction;

}
