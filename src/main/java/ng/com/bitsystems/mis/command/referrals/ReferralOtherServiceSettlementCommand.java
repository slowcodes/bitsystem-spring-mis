package ng.com.bitsystems.mis.command.referrals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.accounts.OtherServiceCommand;

@Setter
@Getter
@NoArgsConstructor
public class ReferralOtherServiceSettlementCommand {
    private Long id;
    private Long referralSettlementId;
    private OtherServiceCommand otherServiceCommand;
}
