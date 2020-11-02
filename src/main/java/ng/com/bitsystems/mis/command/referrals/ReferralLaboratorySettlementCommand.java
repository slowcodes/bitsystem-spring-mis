package ng.com.bitsystems.mis.command.referrals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.laboratory.LaboratoryTransactionCommand;

@Setter
@Getter
@NoArgsConstructor
public class ReferralLaboratorySettlementCommand {
    private Long id;
    private ReferralSettlementCommand referralSettlementCommand;
    private LaboratoryTransactionCommand laboratoryTransactionCommand;
}
