package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.RewardBasedPromoCommand;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyRewardBasedPromo;
import org.springframework.core.convert.converter.Converter;

public class RewardPromoCommandToRewardPromo implements
Converter<RewardBasedPromoCommand, PharmacyRewardBasedPromo>{
    @Override
    public PharmacyRewardBasedPromo convert(RewardBasedPromoCommand source) {
        return null;
    }
}
