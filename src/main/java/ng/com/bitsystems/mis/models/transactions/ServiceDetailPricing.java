package ng.com.bitsystems.mis.models.transactions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.ServicePriceCode;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ServiceDetailPricing extends BaseEntity {

    private Integer useDiscountPrice;
    @OneToOne
    private ServicePriceCode servicePriceCode;
}
