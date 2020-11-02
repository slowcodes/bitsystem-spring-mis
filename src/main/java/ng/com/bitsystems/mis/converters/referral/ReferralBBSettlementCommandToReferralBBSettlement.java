package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralBloodBankSettlementCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank.BBTxnDetailCommandToBBTxnDetail;
import ng.com.bitsystems.mis.models.referrals.ReferralBloodBankSettlement;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ReferralBBSettlementCommandToReferralBBSettlement
implements Converter<ReferralBloodBankSettlementCommand, ReferralBloodBankSettlement> {
    private BBTxnDetailCommandToBBTxnDetail bbTxnDetailCommandToBBTxnDetail;
    private ReferralSettlementCommandToReferralSettlement referralSettlementCommandToReferralSettlement;



    @Nullable
    @Override
    public ReferralBloodBankSettlement convert(ReferralBloodBankSettlementCommand source) {
        if(source==null)
            return null;

        final ReferralBloodBankSettlement referralBloodBankSettlement=new ReferralBloodBankSettlement();

        referralBloodBankSettlement.setId(source.getId());
        referralBloodBankSettlement.setBloodbankTransactionDetails(bbTxnDetailCommandToBBTxnDetail.convert(source.getBloodbankTransactionDetail()));
        referralBloodBankSettlement.setReferralSettlements(referralSettlementCommandToReferralSettlement.convert(source.getReferralSettlement()));

        return referralBloodBankSettlement;
    }
}
