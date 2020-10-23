package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralSettlementCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralSettlements;
import org.springframework.core.convert.converter.Converter;

public class ReferralSettlementCommandToReferralSettlement
        implements Converter<ReferralSettlementCommand, ReferralSettlements> {
    @Override
    public ReferralSettlements convert(ReferralSettlementCommand source) {
        return null;
    }
}
