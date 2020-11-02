package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralPharmacySettlementCommand;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.PharmSalesTxnCommandToPharmSaleTxn;
import ng.com.bitsystems.mis.models.referrals.ReferralPharmacySettlement;
import ng.com.bitsystems.mis.models.referrals.ReferralSettlements;
import org.springframework.core.convert.converter.Converter;

public class ReferralPharmSettlementCommandToReferralPharmSettlement
implements Converter<ReferralPharmacySettlementCommand, ReferralPharmacySettlement> {
    private ReferralSettlementCommandToReferralSettlement referralSettlementCommandToReferralSettlement;
    private PharmSalesTxnCommandToPharmSaleTxn pharmSalesTxnCommandToPharmSaleTxn;

    public ReferralPharmSettlementCommandToReferralPharmSettlement(ReferralSettlementCommandToReferralSettlement referralSettlementCommandToReferralSettlement,
                                                                   PharmSalesTxnCommandToPharmSaleTxn pharmSalesTxnCommandToPharmSaleTxn) {
        this.referralSettlementCommandToReferralSettlement = referralSettlementCommandToReferralSettlement;
        this.pharmSalesTxnCommandToPharmSaleTxn = pharmSalesTxnCommandToPharmSaleTxn;
    }

    @Override
    public ReferralPharmacySettlement convert(ReferralPharmacySettlementCommand source) {
        if(source==null){
            return null;
        }
        final ReferralPharmacySettlement settlement = new ReferralPharmacySettlement();
        settlement.setId(source.getId());
        settlement.setPharmacySalesTransactions(pharmSalesTxnCommandToPharmSaleTxn.convert(source.getPharmacySalesTransactionCommand()));
        if(source.getReferralSettlementsId()!=null){
            ReferralSettlements referralSettlements=new ReferralSettlements();
            referralSettlements.setId(source.getReferralSettlementsId());
            settlement.setReferralSettlements(referralSettlements);
            ReferralSettlements rs = referralSettlements.addPharmSaleTxnSettlement(settlement);
        }
        return settlement;
    }
}
