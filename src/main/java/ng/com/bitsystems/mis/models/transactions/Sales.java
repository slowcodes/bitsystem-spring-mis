package ng.com.bitsystems.mis.models.transactions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;

import javax.persistence.MappedSuperclass;
import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Sales extends BaseEntity {

    private ServicePriceCode servicePriceCode;
    private Integer userDiscount;
    private Integer useDiscountPrice;
    private String comment;
    private Date timeOfTransaction;
    private Integer reversal;
}
