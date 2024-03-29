package ng.com.bitsystems.mis.command.referrals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ReferralReferralCommand {
    private Long id;
    private ReferralCommand referral;
    private ReferralCommand referred;
}
