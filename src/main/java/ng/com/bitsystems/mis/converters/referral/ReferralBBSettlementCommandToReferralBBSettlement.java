package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralBloodBankSettlementCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank.BBTxnDetailCommandToBBTxnDetail;
import ng.com.bitsystems.mis.models.referrals.ReferralBloodBankSettlement;
import ng.com.bitsystems.mis.models.referrals.ReferralSettlements;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ReferralBBSettlementCommandToReferralBBSettlement
implements Converter<ReferralBloodBankSettlementCommand, ReferralBloodBankSettlement> {
    private BBTxnDetailCommandToBBTxnDetail bbTxnDetailCommandToBBTxnDetail;

    @Nullable
    @Override
    public ReferralBloodBankSettlement convert(ReferralBloodBankSettlementCommand source) {
        if(source==null)
            return null;

        final ReferralBloodBankSettlement referralBloodBankSettlement=new ReferralBloodBankSettlement();

        referralBloodBankSettlement.setId(source.getId());
        referralBloodBankSettlement.setBloodbankTransactionDetails(bbTxnDetailCommandToBBTxnDetail.convert(source.getBloodbankTransactionDetail()));

        if(source.getReferralSettlementId()!=null){
            ReferralSettlements settlements=new ReferralSettlements();
            settlements.setId(source.getReferralSettlementId());
            referralBloodBankSettlement.setReferralSettlements(settlements);
            settlements.addBBTxnSettlement(referralBloodBankSettlement);
        }
        return referralBloodBankSettlement;
    }
}
