package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralPharmacySettlementCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralPharmacySettlement;
import org.springframework.core.convert.converter.Converter;

public class ReferralPharmSettlementCommandToReferralPharmSettlement
implements Converter<ReferralPharmacySettlementCommand, ReferralPharmacySettlement> {
    @Override
    public ReferralPharmacySettlement convert(ReferralPharmacySettlementCommand source) {
        return null;
    }
}
