package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralCommand;
import ng.com.bitsystems.mis.models.referrals.Referrals;
import org.springframework.core.convert.converter.Converter;

public class ReferralToReferralCommand implements Converter<Referrals, ReferralCommand> {
    @Override
    public ReferralCommand convert(Referrals source) {
        return null;
    }
}
