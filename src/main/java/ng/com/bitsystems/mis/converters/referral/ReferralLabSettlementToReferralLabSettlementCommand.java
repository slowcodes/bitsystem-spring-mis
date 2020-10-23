package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralLaboratorySettlementCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralLaboratorySettlements;
import org.springframework.core.convert.converter.Converter;

public class ReferralLabSettlementToReferralLabSettlementCommand implements
        Converter<ReferralLaboratorySettlements, ReferralLaboratorySettlementCommand> {
    @Override
    public ReferralLaboratorySettlementCommand convert(ReferralLaboratorySettlements source) {
        return null;
    }
}
