package ng.com.bitsystems.mis.command.admissions.facilitties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class EndUsageCommand {
    private Long id;
    private StartUsageCommand startUsageCommand;
    private LocalDateTime stopTime;
    private String comment;
}
