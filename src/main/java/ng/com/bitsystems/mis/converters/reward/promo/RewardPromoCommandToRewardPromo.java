package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.RewardBasedPromoCommand;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyRewardBasedPromo;
import org.springframework.core.convert.converter.Converter;

public class RewardPromoCommandToRewardPromo implements
Converter<RewardBasedPromoCommand, PharmacyRewardBasedPromo>{
    @Override
    public PharmacyRewardBasedPromo convert(RewardBasedPromoCommand source) {

        if(source==null)
            return null;

        PharmacyRewardBasedPromo promo = new PharmacyRewardBasedPromo();
        promo.setId(source.getId());
        promo.setQty(source.getQty());

        if(source.getPromosProductsId()!=null){
            PharmacyProducts pharmacyProducts=new PharmacyProducts();
            pharmacyProducts.setId(source.getPromosProductsId());
            promo.setRewardProducts(pharmacyProducts);
            PharmacyProducts pharmacyProduct = pharmacyProducts.addRewardBasedPromo(promo);
        }

        if(source.getRewardProductId()!=null){
            PharmacyProducts products = new PharmacyProducts();
            products.setId(source.getRewardProductId());
            promo.setRewardProducts(products);
            PharmacyProducts pharmacyProducts = products.addRewardProductPromo(promo);
        }

        return promo;
    }
}
