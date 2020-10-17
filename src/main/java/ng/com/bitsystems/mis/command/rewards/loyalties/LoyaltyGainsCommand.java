package ng.com.bitsystems.mis.command.rewards.loyalties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class LoyaltyGainsCommand {
    private Long id;
    private Long patientId;
    private Long patientsLoyaltyActivityId;
    private Integer redemption;
    private LocalDate date;
}
