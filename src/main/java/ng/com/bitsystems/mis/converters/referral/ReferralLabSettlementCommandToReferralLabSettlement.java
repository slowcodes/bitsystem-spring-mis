package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralLaboratorySettlementCommand;
import ng.com.bitsystems.mis.converters.transaction.laboratory.LabTxnCommandToLabTxn;
import ng.com.bitsystems.mis.models.referrals.ReferralLaboratorySettlements;
import ng.com.bitsystems.mis.models.referrals.ReferralSettlements;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ReferralLabSettlementCommandToReferralLabSettlement
implements Converter<ReferralLaboratorySettlementCommand, ReferralLaboratorySettlements> {
    private LabTxnCommandToLabTxn labTxnCommandToLabTxn;

    public ReferralLabSettlementCommandToReferralLabSettlement(LabTxnCommandToLabTxn labTxnCommandToLabTxn) {
        this.labTxnCommandToLabTxn = labTxnCommandToLabTxn;
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
        if(source.getReferralSettlementId()!=null){
            ReferralSettlements settlements = new ReferralSettlements();
            settlements.setId(source.getReferralSettlementId());
            referralLaboratorySettlements.setReferralSettlements(settlements);
            settlements.addLabTxnSettlement(referralLaboratorySettlements);
        }
        return referralLaboratorySettlements;
    }
}
