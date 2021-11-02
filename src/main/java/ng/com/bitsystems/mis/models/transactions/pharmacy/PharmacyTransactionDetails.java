package ng.com.bitsystems.mis.models.transactions.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromoProductRecivedLogs;
import ng.com.bitsystems.mis.models.transactions.ProductPrice;
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
public class PharmacyTransactionDetails extends BasePharmTxnDetails {


    @ManyToOne
    @JoinColumn(name = "transaction_id")
    private Transaction transaction;

    @OneToOne
    private ProductPrice goodsTransaction;

    public PharmacyTransactionDetails addAdditionalDetail(AdditionalTransactionDetails details) {
        super.getAdditionalTransactionDetails().add(details);
        details.setPharmacyTransactionDetails(this);
        return this;
    }

    public PharmacyTransactionDetails addRecievedPromoLog(PharmacyPromoProductRecivedLogs recivedLogs) {

        return this;
    }
}
