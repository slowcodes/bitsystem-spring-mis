package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralPharmacySettlementCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralPharmacySettlement;
import org.springframework.core.convert.converter.Converter;

public class ReferralPharmSettlementToReferralPharmSettlementCommand
implements Converter<ReferralPharmacySettlement, ReferralPharmacySettlementCommand> {
    @Override
    public ReferralPharmacySettlementCommand convert(ReferralPharmacySettlement source) {
        return null;
    }
}
