package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralLaboratorySettlementCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnToLabTxnCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralLaboratorySettlements;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ReferralLabSettlementToReferralLabSettlementCommand implements
        Converter<ReferralLaboratorySettlements, ReferralLaboratorySettlementCommand> {
    private LabTxnToLabTxnCommand labTxnToLabTxnCommand;


    public ReferralLabSettlementToReferralLabSettlementCommand(LabTxnToLabTxnCommand labTxnToLabTxnCommand) {
        this.labTxnToLabTxnCommand = labTxnToLabTxnCommand;
    }

    @Override
    @Nullable
    public ReferralLaboratorySettlementCommand convert(ReferralLaboratorySettlements source) {
        if(source==null)
            return null;
        ReferralLaboratorySettlementCommand command=new ReferralLaboratorySettlementCommand();

        command.setId(source.getId());
        command.setLaboratoryTransactionCommand(labTxnToLabTxnCommand.convert(source.getLaboratoryTransaction()));

        if(source.getLaboratoryTransaction()!=null)
            command.setReferralSettlementId(source.getLaboratoryTransaction().getId());

        return command;
    }
}
