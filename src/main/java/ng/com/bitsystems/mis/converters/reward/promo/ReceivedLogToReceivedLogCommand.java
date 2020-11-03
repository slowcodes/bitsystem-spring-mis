package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.PromoProductReceivedLogsCommand;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromoProductRecivedLogs;
import org.springframework.core.convert.converter.Converter;

public class ReceivedLogToReceivedLogCommand  implements Converter<PharmacyPromoProductRecivedLogs, PromoProductReceivedLogsCommand> {
    @Override
    public PromoProductReceivedLogsCommand convert(PharmacyPromoProductRecivedLogs source) {
        if(source==null)
            return null;


        final PromoProductReceivedLogsCommand logsCommand=new PromoProductReceivedLogsCommand();
        if (source.getPharmacyPromosProducts()!=null)
            logsCommand.setPromoId(source.getPharmacyPromosProducts().getId());

        if(source.getPharmacyTransactionDetails()!=null)
            logsCommand.setPharmacyTransactionDetailsId(source.getPharmacyTransactionDetails().getId());
        return logsCommand;
    }
}
