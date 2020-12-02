package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralBloodBankSettlementCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank.BBTxnDetailToBBTxnDetailCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralBloodBankSettlement;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ReferralBBSettlementToReferralBBSettlementCommand implements
        Converter<ReferralBloodBankSettlement, ReferralBloodBankSettlementCommand> {
    private BBTxnDetailToBBTxnDetailCommand bbTxnDetailToBBTxnDetailCommand;

    public ReferralBBSettlementToReferralBBSettlementCommand(BBTxnDetailToBBTxnDetailCommand bbTxnDetailToBBTxnDetailCommand,
                                                             ReferralSettlementToReferralSettlementCommand referralSettlementToReferralSettlementCommand) {
        this.bbTxnDetailToBBTxnDetailCommand = bbTxnDetailToBBTxnDetailCommand;
    }

    @Nullable
    @Override
    public ReferralBloodBankSettlementCommand convert(ReferralBloodBankSettlement source) {
        if(source==null)
            return null;

        ReferralBloodBankSettlementCommand command=new ReferralBloodBankSettlementCommand();
        command.setId(source.getId());
        command.setBloodbankTransactionDetail(bbTxnDetailToBBTxnDetailCommand.convert(source.getBloodbankTransactionDetails()));
        if(source.getReferralSettlement()!=null){
            command.setReferralSettlementId(source.getReferralSettlement().getId());
        }
        return command;
    }
}
