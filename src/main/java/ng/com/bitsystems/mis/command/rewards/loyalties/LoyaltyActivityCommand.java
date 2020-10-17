package ng.com.bitsystems.mis.command.rewards.loyalties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class LoyaltyActivityCommand {
    private Long id;
    private String activity;
    private Integer points;
    private Set<LoyaltyGainsCommand> loyaltyGainsCommands = new HashSet<>();
}
