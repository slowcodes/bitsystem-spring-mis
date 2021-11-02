package ng.com.bitsystems.mis.models.transactions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.BaseEntity;
import ng.com.bitsystems.mis.models.accounts.pricing.SalesPriceCode;

import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductPrice extends BaseEntity {
    @OneToOne
    private SalesPriceCode salesPriceCode;
    private Integer userDiscount;
    private Integer useDiscountPrice;
    private Integer quantity;
    @OneToOne
    Transaction transaction;
}
