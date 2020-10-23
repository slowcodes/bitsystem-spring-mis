package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralVaccinationSettlementCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralVaccinationSettlement;
import org.springframework.core.convert.converter.Converter;

public class ReferralVaccSettlementToReferralVaccSettlementCommand implements Converter<ReferralVaccinationSettlement, ReferralVaccinationSettlementCommand> {
    @Override
    public ReferralVaccinationSettlementCommand convert(ReferralVaccinationSettlement source) {
        return null;
    }
}
