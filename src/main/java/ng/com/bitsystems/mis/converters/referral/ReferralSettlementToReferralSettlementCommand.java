package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralSettlementCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralSettlements;
import org.springframework.core.convert.converter.Converter;

public class ReferralSettlementToReferralSettlementCommand
implements Converter<ReferralSettlements, ReferralSettlementCommand> {
    @Override
    public ReferralSettlementCommand convert(ReferralSettlements source) {
        return null;
    }
}
