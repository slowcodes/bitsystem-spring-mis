package ng.com.bitsystems.mis.models.transactions;

import lombok.*;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;

import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import java.util.Date;

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
    private Date timeOfTransaction;
    private Integer reversal;

}
