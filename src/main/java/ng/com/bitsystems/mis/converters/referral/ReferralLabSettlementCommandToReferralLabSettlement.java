package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralLaboratorySettlementCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnCommandToLabTxn;
import ng.com.bitsystems.mis.models.referrals.ReferralLaboratorySettlements;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ReferralLabSettlementCommandToReferralLabSettlement
implements Converter<ReferralLaboratorySettlementCommand, ReferralLaboratorySettlements> {
    private LabTxnCommandToLabTxn labTxnCommandToLabTxn;
    private ReferralSettlementCommandToReferralSettlement referralSettlementCommandToReferralSettlement;

    public ReferralLabSettlementCommandToReferralLabSettlement(LabTxnCommandToLabTxn labTxnCommandToLabTxn,
                                                               ReferralSettlementCommandToReferralSettlement referralSettlementCommandToReferralSettlement) {
        this.labTxnCommandToLabTxn = labTxnCommandToLabTxn;
        this.referralSettlementCommandToReferralSettlement = referralSettlementCommandToReferralSettlement;
    }

    @Nullable
    @Override
    public ReferralLaboratorySettlements convert(ReferralLaboratorySettlementCommand source) {
        if(source==null){
            return null;
        }

        ReferralLaboratorySettlements referralLaboratorySettlements = new ReferralLaboratorySettlements();
        referralLaboratorySettlements.setId(source.getId());
        referralLaboratorySettlements.setLaboratoryTransaction(labTxnCommandToLabTxn.convert(source.getLaboratoryTransactionCommand()));
        referralLaboratorySettlements.setReferralSettlements(referralSettlementCommandToReferralSettlement.convert(source.getReferralSettlementCommand()));
        return referralLaboratorySettlements;
    }
}
