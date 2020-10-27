package ng.com.bitsystems.mis.command.accounts.pricing;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class SalesPriceCodeCommand {
    private Long id;
    private Double buyingPrice;
    private Double sellingPrice;
    private Integer discountQuantity;
    private Double discountPrice;
    private Double tax;
}
