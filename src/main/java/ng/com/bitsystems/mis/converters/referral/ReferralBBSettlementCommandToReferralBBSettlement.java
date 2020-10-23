package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralBloodBankSettlementCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralBloodBankSettlement;
import org.springframework.core.convert.converter.Converter;

public class ReferralBBSettlementCommandToReferralBBSettlement
implements Converter<ReferralBloodBankSettlementCommand, ReferralBloodBankSettlement> {
    @Override
    public ReferralBloodBankSettlement convert(ReferralBloodBankSettlementCommand source) {
        return null;
    }
}
