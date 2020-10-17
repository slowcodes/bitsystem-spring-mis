package ng.com.bitsystems.mis.command.referrals;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.users.Users;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class ReferralSettlementCommand {
    private Long id;
    private Users preparedBy;
    private LocalDate datePrepared;
    private Double commission;
}
