package ng.com.bitsystems.mis.converters.reward.promo;

import ng.com.bitsystems.mis.command.rewards.promo.PromoProductReceivedLogsCommand;
import ng.com.bitsystems.mis.models.rewards.promos.PharmacyPromoProductRecivedLogs;
import org.springframework.core.convert.converter.Converter;

public class ReceivedLogToReceivedLogCommand  implements Converter<PharmacyPromoProductRecivedLogs, PromoProductReceivedLogsCommand> {
    @Override
    public PromoProductReceivedLogsCommand convert(PharmacyPromoProductRecivedLogs source) {
        return null;
    }
}
