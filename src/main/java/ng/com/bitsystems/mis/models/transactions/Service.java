package ng.com.bitsystems.mis.models.transactions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Service extends BaseEntity {

    @OneToOne
    private ServicePriceCode servicePriceCode;
    private Integer userDiscount;
    private Integer frequency;
    private Integer useDiscountPrice;
    private String comment;
    private LocalDate timeOfTransaction;
    private Integer reversal;

//    @ManyToOne
//    @JoinColumn(name = "referralSettlementDetails_id")
//    private ReferralSettlements referralSettlements;
}
