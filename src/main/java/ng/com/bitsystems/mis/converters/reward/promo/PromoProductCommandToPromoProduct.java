package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.PromoProductCommand;
import ng.com.bitsystems.mis.models.pharmacy.PharmacyProducts;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromosProducts;
import ng.com.bitsystems.mis.models.users.Users;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class PromoProductCommandToPromoProduct implements Converter<PromoProductCommand, PharmacyPromosProducts> {

    private ReceivedLogCommandToReceivedLog receivedLogCommandToReceivedLog;

    @Nullable
    @Override
    public PharmacyPromosProducts convert(PromoProductCommand source) {
        if(source==null)
            return null;

        final PharmacyPromosProducts pharmacyPromosProducts = new PharmacyPromosProducts();
        pharmacyPromosProducts.setDateCreated(source.getDateCreated());
        pharmacyPromosProducts.setDescription(source.getDescription());
        pharmacyPromosProducts.setEndDay(source.getEndDay());
        pharmacyPromosProducts.setStartDay(source.getStartDay());
        if(source.getPharmacyProductId()!=null){
            PharmacyProducts pharmacyProducts = new PharmacyProducts();
            pharmacyProducts.setId(source.getPharmacyProductId());
            pharmacyPromosProducts.setPharmacyProducts(pharmacyProducts);
            PharmacyProducts pharmacyProduct = pharmacyProducts.addPromoProduct(pharmacyPromosProducts);
        }

        if(source.getPromoProductReceivedLogsCommands()!=null && source.getPromoProductReceivedLogsCommands().size()>0)
            source.getPromoProductReceivedLogsCommands().forEach(promoProductReceivedLogsCommand ->
                    pharmacyPromosProducts.getPharmacyPromoProductRecivedLogs().add(
                            receivedLogCommandToReceivedLog.convert(promoProductReceivedLogsCommand)
                    ));

        pharmacyPromosProducts.setProductPromoExclusivity(source.getProductPromoExclusivity());
        pharmacyPromosProducts.setQty(source.getQty());
        pharmacyPromosProducts.setStatus(source.getStatus());
        pharmacyPromosProducts.setTitle(source.getTitle());

        if(source.getUserId()!=null){
            Users users = new Users();
            users.setId(source.getUserId());
            pharmacyPromosProducts.setUsers(users);
            Users user = users.addPromoProduct(pharmacyPromosProducts);
        }

        pharmacyPromosProducts.setId(source.getId());

        return pharmacyPromosProducts;

    }
}
