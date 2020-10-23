package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.PromoProductCommand;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromosProducts;
import org.springframework.core.convert.converter.Converter;

public class PromoProductToPromoProductCommand implements Converter<PharmacyPromosProducts, PromoProductCommand> {
    @Override
    public PromoProductCommand convert(PharmacyPromosProducts source) {
        return null;
    }
}
