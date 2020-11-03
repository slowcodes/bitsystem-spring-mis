package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralOtherServiceSettlementCommand;
import ng.com.bitsystems.mis.converters.accounts.OtherServiceCommandToOtherService;
import ng.com.bitsystems.mis.models.referrals.ReferralOtherServiceSettlement;
import ng.com.bitsystems.mis.models.referrals.ReferralSettlements;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ReferralOtherServiceCommandToOtherServiceSettlement implements
        Converter<ReferralOtherServiceSettlementCommand, ReferralOtherServiceSettlement> {
    private OtherServiceCommandToOtherService otherServiceCommandToOtherService;

    @Nullable
    @Override
    public ReferralOtherServiceSettlement convert(ReferralOtherServiceSettlementCommand source) {
        if(source==null)
            return null;

        ReferralOtherServiceSettlement serviceSettlement = new ReferralOtherServiceSettlement();
        serviceSettlement.setId(source.getId());
        serviceSettlement.setOtherService(otherServiceCommandToOtherService.convert(source.getOtherServiceCommand()));
        if(source.getReferralSettlementId()!=null){
            ReferralSettlements referralSettlements=new ReferralSettlements();
            referralSettlements.setId(source.getReferralSettlementId());
            serviceSettlement.setReferralSettlements(referralSettlements);
            referralSettlements.addOtherServiceTxnSettlement(serviceSettlement);
        }
        return  serviceSettlement;
    }
}
