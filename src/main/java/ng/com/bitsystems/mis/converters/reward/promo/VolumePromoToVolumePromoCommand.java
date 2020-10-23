package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.VolumeBasedPromosCommand;
import ng.com.bitsystems.mis.models.rewards.promos.VolumedBasedPromos;
import org.springframework.core.convert.converter.Converter;

public class VolumePromoToVolumePromoCommand implements Converter<VolumedBasedPromos, VolumeBasedPromosCommand> {
    @Override
    public VolumeBasedPromosCommand convert(VolumedBasedPromos source) {
        return null;
    }
}
