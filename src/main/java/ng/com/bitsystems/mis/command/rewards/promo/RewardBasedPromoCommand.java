package ng.com.bitsystems.mis.command.rewards.promo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.pharmacy.PharmacyProductCommand;

@Setter
@Getter
@NoArgsConstructor
public class RewardBasedPromoCommand {
    private Long id;
    private PharmacyProductCommand pharmacyProductCommand;
    private Long promosProductsCommandId;
    private int qty;
}
