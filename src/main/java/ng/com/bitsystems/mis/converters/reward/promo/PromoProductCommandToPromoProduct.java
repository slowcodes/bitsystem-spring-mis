package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.PromoProductCommand;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromosProducts;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class PromoProductCommandToPromoProduct implements Converter<PromoProductCommand, PharmacyPromosProducts> {


    @Nullable
    @Override
    public PharmacyPromosProducts convert(PromoProductCommand source) {
        if(source==null)
            return null;

        final PharmacyPromosProducts pharmacyPromosProducts = new PharmacyPromosProducts();

        return pharmacyPromosProducts;
    }
}
