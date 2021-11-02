package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralPharmacySettlementCommand;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.SalesCommandToSales;
import ng.com.bitsystems.mis.models.referrals.ReferralPharmacySettlement;
import ng.com.bitsystems.mis.models.referrals.ReferralSettlements;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ReferralPharmSettlementCommandToReferralPharmSettlement
implements Converter<ReferralPharmacySettlementCommand, ReferralPharmacySettlement> {
    private SalesCommandToSales salesCommandToSales;

    public ReferralPharmSettlementCommandToReferralPharmSettlement(SalesCommandToSales salesCommandToSales) {
        this.salesCommandToSales = salesCommandToSales;
    }

    @Override
    public ReferralPharmacySettlement convert(ReferralPharmacySettlementCommand source) {
        if(source==null){
            return null;
        }
        final ReferralPharmacySettlement settlement = new ReferralPharmacySettlement();
        settlement.setId(source.getId());
        settlement.setSales(salesCommandToSales.convert(source.getSalesCommand()));
        if(source.getReferralSettlementsId()!=null){
            ReferralSettlements referralSettlements=new ReferralSettlements();
            referralSettlements.setId(source.getReferralSettlementsId());
            settlement.setReferralSettlements(referralSettlements);
            ReferralSettlements rs = referralSettlements.addPharmSaleTxnSettlement(settlement);
        }
        return settlement;
    }
}
