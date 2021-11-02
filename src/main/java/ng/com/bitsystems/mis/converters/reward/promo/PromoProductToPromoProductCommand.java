package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.PromoProductCommand;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromosProducts;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class PromoProductToPromoProductCommand implements Converter<PharmacyPromosProducts, PromoProductCommand> {
    private ReceivedLogToReceivedLogCommand receivedLogToReceivedLogCommand;

    public PromoProductToPromoProductCommand(ReceivedLogToReceivedLogCommand receivedLogToReceivedLogCommand) {
        this.receivedLogToReceivedLogCommand = receivedLogToReceivedLogCommand;
    }

    @Nullable
    @Override
    public PromoProductCommand convert(PharmacyPromosProducts source) {
        if(source==null){
            return null;
        }
        PromoProductCommand promoProductCommand=new PromoProductCommand();
        promoProductCommand.setDateCreated(source.getDateCreated());
        promoProductCommand.setDescription(source.getDescription());
        promoProductCommand.setEndDay(source.getEndDay());
        promoProductCommand.setId(source.getId());

        if(source.getPharmacyProducts()!=null){
            promoProductCommand.setPharmacyProductId(source.getPharmacyProducts().getId());
        }

        promoProductCommand.setProductPromoExclusivity(source.getProductPromoExclusivity());

        if(source.getPharmacyPromoProductRecivedLogs()!=null && source.getPharmacyPromoProductRecivedLogs().size()>0){
            source.getPharmacyPromoProductRecivedLogs().forEach(pharmacyPromoProductRecivedLogs ->
                    promoProductCommand.getPromoProductReceivedLogsCommands().add(
                            receivedLogToReceivedLogCommand.convert(pharmacyPromoProductRecivedLogs)
                    ));
        }
        promoProductCommand.setQty(source.getQty());
        promoProductCommand.setStartDay(source.getStartDay());
        promoProductCommand.setEndDay(source.getEndDay());
        promoProductCommand.setStatus(source.getStatus());
        promoProductCommand.setTitle(source.getTitle());

        if(source.getAppUsers()!=null)
            promoProductCommand.setUserId(source.getAppUsers().getId());

        return  promoProductCommand;
    }
}
