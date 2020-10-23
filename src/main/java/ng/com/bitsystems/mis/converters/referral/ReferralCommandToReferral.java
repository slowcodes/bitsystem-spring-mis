package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralCommand;
import ng.com.bitsystems.mis.models.referrals.Referrals;
import org.springframework.core.convert.converter.Converter;

public class ReferralCommandToReferral implements Converter<ReferralCommand, Referrals> {
    @Override
    public Referrals convert(ReferralCommand source) {
        return null;
    }
}
