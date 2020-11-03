package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralOtherServiceSettlementCommand;
import ng.com.bitsystems.mis.converters.accounts.OtherServiceToOtherServiceCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralOtherServiceSettlement;
import org.springframework.core.convert.converter.Converter;

public class ReferralOtherServiceToOtherServiceSettlementCommand implements
        Converter<ReferralOtherServiceSettlement, ReferralOtherServiceSettlementCommand> {

    private OtherServiceToOtherServiceCommand otherServiceToOtherServiceCommand;

    public ReferralOtherServiceToOtherServiceSettlementCommand(OtherServiceToOtherServiceCommand otherServiceToOtherServiceCommand) {
        this.otherServiceToOtherServiceCommand = otherServiceToOtherServiceCommand;
    }


    @Override
    public ReferralOtherServiceSettlementCommand convert(ReferralOtherServiceSettlement source) {
        if(source==null){
            return null;
        }
        ReferralOtherServiceSettlementCommand settlementCommand=new ReferralOtherServiceSettlementCommand();
        settlementCommand.setId(source.getId());
        settlementCommand.setOtherServiceCommand(otherServiceToOtherServiceCommand.convert(source.getOtherService()));

        if(source.getReferralSettlements()!=null){
            settlementCommand.setReferralSettlementId(source.getReferralSettlements().getId());
        }

        return settlementCommand;
    }
}
