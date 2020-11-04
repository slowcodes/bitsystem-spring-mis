package ng.com.bitsystems.mis.command.rewards.loyalties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.rewards.loyalties.Activities;

@Setter
@Getter
@NoArgsConstructor
public class LoyaltyActivityCommand {
    private Long id;
    private Activities activity;
    private Integer points;
    private Integer active;
}
