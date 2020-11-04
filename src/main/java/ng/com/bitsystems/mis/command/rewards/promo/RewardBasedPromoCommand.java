package ng.com.bitsystems.mis.command.rewards.promo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RewardBasedPromoCommand {
    private Long id;
    private Long rewardProductId;
    private Long promosProductsId;
    private int qty;
}
