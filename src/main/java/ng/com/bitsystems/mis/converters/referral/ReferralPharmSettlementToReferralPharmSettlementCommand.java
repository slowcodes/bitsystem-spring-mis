package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralPharmacySettlementCommand;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.PharmSaleTxnToPharmSalesTxnCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralPharmacySettlement;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

public class ReferralPharmSettlementToReferralPharmSettlementCommand
implements Converter<ReferralPharmacySettlement, ReferralPharmacySettlementCommand> {
    private PharmSaleTxnToPharmSalesTxnCommand pharmSaleTxnToPharmSalesTxnCommand;
    @Nullable
    @Override
    public ReferralPharmacySettlementCommand convert(ReferralPharmacySettlement source) {
        if(source==null){
            return null;
        }
        final ReferralPharmacySettlementCommand command = new ReferralPharmacySettlementCommand();

        command.setId(source.getId());
        command.setPharmacySalesTransactionCommand(pharmSaleTxnToPharmSalesTxnCommand.convert(source.getPharmacySalesTransactions()));

        if(source.getReferralSettlements()!=null){
            command.setReferralSettlementsId(source.getReferralSettlements().getId());
        }

        return command;
    }
}
