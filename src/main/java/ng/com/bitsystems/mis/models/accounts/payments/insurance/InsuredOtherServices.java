package ng.com.bitsystems.mis.models.accounts.payments.insurance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.accounts.OtherServices;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InsuredOtherServices extends InsuranceTransactions {

    @ManyToOne()
    private OtherServices otherServices;
}
