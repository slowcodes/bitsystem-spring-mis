package ng.com.bitsystems.mis.converters.referral;

import ng.com.bitsystems.mis.command.referrals.ReferralPharmacySettlementCommand;
import ng.com.bitsystems.mis.converters.transaction.pharmacy.SalesToSalesCommand;
import ng.com.bitsystems.mis.models.referrals.ReferralPharmacySettlement;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ReferralPharmSettlementToReferralPharmSettlementCommand
implements Converter<ReferralPharmacySettlement, ReferralPharmacySettlementCommand> {

    private SalesToSalesCommand salesToSalesCommand;

    public ReferralPharmSettlementToReferralPharmSettlementCommand(SalesToSalesCommand salesToSalesCommand) {
        this.salesToSalesCommand = salesToSalesCommand;
    }

    @Nullable
    @Override
    public ReferralPharmacySettlementCommand convert(ReferralPharmacySettlement source) {
        if(source==null){
            return null;
        }
        final ReferralPharmacySettlementCommand command = new ReferralPharmacySettlementCommand();

        command.setId(source.getId());
        command.setSalesCommand(salesToSalesCommand.convert(source.getSales()));

        if(source.getReferralSettlements()!=null){
            command.setReferralSettlementsId(source.getReferralSettlements().getId());
        }

        return command;
    }
}
