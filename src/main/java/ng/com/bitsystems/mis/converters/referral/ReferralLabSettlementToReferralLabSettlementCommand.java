package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralLaboratorySettlementCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnToLabTxnCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralLaboratorySettlements;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ReferralLabSettlementToReferralLabSettlementCommand implements
        Converter<ReferralLaboratorySettlements, ReferralLaboratorySettlementCommand> {
    private LabTxnToLabTxnCommand labTxnToLabTxnCommand;
    private ReferralSettlementToReferralSettlementCommand referralSettlementToReferralSettlementCommand;

    public ReferralLabSettlementToReferralLabSettlementCommand(LabTxnToLabTxnCommand labTxnToLabTxnCommand,
                                                               ReferralSettlementToReferralSettlementCommand referralSettlementToReferralSettlementCommand) {
        this.labTxnToLabTxnCommand = labTxnToLabTxnCommand;
        this.referralSettlementToReferralSettlementCommand = referralSettlementToReferralSettlementCommand;
    }

    @Override
    @Nullable
    public ReferralLaboratorySettlementCommand convert(ReferralLaboratorySettlements source) {
        if(source==null)
            return null;
        ReferralLaboratorySettlementCommand command=new ReferralLaboratorySettlementCommand();

        command.setId(source.getId());
        command.setLaboratoryTransactionCommand(labTxnToLabTxnCommand.convert(source.getLaboratoryTransaction()));
        command.setReferralSettlementCommand(referralSettlementToReferralSettlementCommand.convert(source.getReferralSettlements()));

        return command;
    }
}
