package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralVaccinationSettlementCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralVaccinationSettlement;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ReferralVaccSettlementCommandToReferralVaccSettlement
implements Converter<ReferralVaccinationSettlementCommand, ReferralVaccinationSettlement> {
    @Override
    public ReferralVaccinationSettlement convert(ReferralVaccinationSettlementCommand source) {
        return null;
    }
}
