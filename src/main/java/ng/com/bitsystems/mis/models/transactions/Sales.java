package ng.com.bitsystems.mis.models.transactions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;
import ng.com.bitsystems.mis.models.referrals.Referrals;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Sales extends BaseEntity {

    @OneToOne
    private SalesPriceCode salesPriceCode;

    private Integer userDiscount;
    private Integer useDiscountPrice;
    private String comment;
    private Date timeOfTransaction;
    private Integer reversal;

    @ManyToOne
    @JoinColumn(name = "referrals_id")
    private Referrals referrals;

}
