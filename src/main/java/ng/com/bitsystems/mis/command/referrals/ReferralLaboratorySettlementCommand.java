package ng.com.bitsystems.mis.command.referrals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ReferralLaboratorySettlementCommand {
    private Long id;
    private Long referralSettlementId;
    private Long laboratoryTransactionDetailsId;
}
