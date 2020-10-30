package ng.com.bitsystems.mis.command.laboratories.bloodbank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class BleedingScheduleCommand {
    private Long id;
    private ClearedQueueCommand clearedQueueCommand;
    private Long userId;
    private LocalDateTime timeOfSchedule;
    private DonationQueueCommand donationQueueCommand;
}
