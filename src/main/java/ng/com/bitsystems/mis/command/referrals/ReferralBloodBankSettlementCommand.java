package ng.com.bitsystems.mis.command.referrals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.transactions.laboratory.bloodbank.BloodBankTransactionDetailCommand;

@Setter
@Getter
@NoArgsConstructor
public class ReferralBloodBankSettlementCommand {
    private Long id;
    private Long referralSettlementId;
    private BloodBankTransactionDetailCommand bloodbankTransactionDetailId;
}
