package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralBloodBankSettlementCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.bloodbank.BBTxnDetailToBBTxnDetailCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralBloodBankSettlement;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ReferralBBSettlementToReferralBBSettlementCommand implements
        Converter<ReferralBloodBankSettlement, ReferralBloodBankSettlementCommand> {
    private BBTxnDetailToBBTxnDetailCommand bbTxnDetailToBBTxnDetailCommand;
    private ReferralSettlementToReferralSettlementCommand referralSettlementToReferralSettlementCommand;

    public ReferralBBSettlementToReferralBBSettlementCommand(BBTxnDetailToBBTxnDetailCommand bbTxnDetailToBBTxnDetailCommand,
                                                             ReferralSettlementToReferralSettlementCommand referralSettlementToReferralSettlementCommand) {
        this.bbTxnDetailToBBTxnDetailCommand = bbTxnDetailToBBTxnDetailCommand;
        this.referralSettlementToReferralSettlementCommand = referralSettlementToReferralSettlementCommand;
    }

    @Nullable
    @Override
    public ReferralBloodBankSettlementCommand convert(ReferralBloodBankSettlement source) {
        if(source==null)
            return null;

        ReferralBloodBankSettlementCommand command=new ReferralBloodBankSettlementCommand();
        command.setId(source.getId());
        command.setBloodbankTransactionDetail(bbTxnDetailToBBTxnDetailCommand.convert(source.getBloodbankTransactionDetails()));
        command.setReferralSettlement(referralSettlementToReferralSettlementCommand.convert(source.getReferralSettlements()));

        return command;
    }
}
