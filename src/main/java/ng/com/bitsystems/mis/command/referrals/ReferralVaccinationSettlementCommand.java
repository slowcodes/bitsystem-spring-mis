package ng.com.bitsystems.mis.command.referrals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.vaccination.VaccinationTransactionDetailCommand;

@Setter
@Getter
@NoArgsConstructor
public class ReferralVaccinationSettlementCommand {
    private Long id;
    private ReferralSettlementCommand referralSettlementCommand;
    private VaccinationTransactionDetailCommand vaccinationTransactionDetailCommand;
}
