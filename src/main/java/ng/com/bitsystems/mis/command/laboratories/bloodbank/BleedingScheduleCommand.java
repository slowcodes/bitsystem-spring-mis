package ng.com.bitsystems.mis.command.laboratories.bloodbank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonationQueue;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class BleedingScheduleCommand {
    private Long id;
    private ClearedQueueCommand clearedQueueCommand;
    private Long userId;
    private LocalDateTime timeOfSchedule;
    private DonationQueue donationQueue;
}
