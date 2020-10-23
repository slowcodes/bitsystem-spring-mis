package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.RewardBasedPromoCommand;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyRewardBasedPromo;
import org.springframework.core.convert.converter.Converter;

public class RewardPromoToRewardPromoCommand implements Converter<PharmacyRewardBasedPromo, RewardBasedPromoCommand> {
    @Override
    public RewardBasedPromoCommand convert(PharmacyRewardBasedPromo source) {
        return null;
    }
}
