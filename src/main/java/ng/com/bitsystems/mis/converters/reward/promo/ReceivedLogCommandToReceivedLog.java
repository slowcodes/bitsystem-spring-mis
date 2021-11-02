package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.PromoProductReceivedLogsCommand;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromoProductRecivedLogs;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromosProducts;
import ng.com.bitsystems.mis.models.transactions.pharmacy.PharmacyTransactionDetails;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ReceivedLogCommandToReceivedLog implements Converter<PromoProductReceivedLogsCommand, PharmacyPromoProductRecivedLogs> {

    @Nullable
    @Override
    public PharmacyPromoProductRecivedLogs convert(PromoProductReceivedLogsCommand source) {
        if(source==null){
            return null;
        }
        final PharmacyPromoProductRecivedLogs recivedLogs=new PharmacyPromoProductRecivedLogs();
        recivedLogs.setId(source.getId());

        if(source.getPromoId()!=null){
            PharmacyPromosProducts promo = new PharmacyPromosProducts();
            promo.setId(source.getId());
            recivedLogs.setPharmacyPromosProducts(promo);
            PharmacyPromosProducts promos = promo.addRecievedLog(recivedLogs);
        }

        if(source.getPharmacyTransactionDetailsId()!=null){
            PharmacyTransactionDetails salesTransaction = new PharmacyTransactionDetails();
            salesTransaction.setId(source.getPharmacyTransactionDetailsId());
            recivedLogs.setPharmacyTransactionDetails(salesTransaction);
            PharmacyTransactionDetails sales = salesTransaction.addRecievedPromoLog(recivedLogs);
        }

        return recivedLogs;
    }
}
