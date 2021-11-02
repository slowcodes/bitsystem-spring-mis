package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.RewardBasedPromoCommand;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyRewardBasedPromo;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RewardPromoToRewardPromoCommand implements Converter<PharmacyRewardBasedPromo, RewardBasedPromoCommand> {
    @Override
    public RewardBasedPromoCommand convert(PharmacyRewardBasedPromo source) {
        if(source==null)
            return null;
        RewardBasedPromoCommand rewardBasedPromoCommand=new RewardBasedPromoCommand();
        rewardBasedPromoCommand.setId(source.getId());
        rewardBasedPromoCommand.setQty(source.getQty());

        if(source.getPharmacyRewardBasedPromo()!=null)
            rewardBasedPromoCommand.setPromosProductsId(source.getPromosProducts().getId());

        if (source.getRewardProducts()!=null)
            rewardBasedPromoCommand.setRewardProductId(source.getRewardProducts().getId());

        return rewardBasedPromoCommand;
    }
}
