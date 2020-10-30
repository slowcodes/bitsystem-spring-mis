package ng.com.bitsystems.mis.command.laboratories.bloodbank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class ClearedQueueCommand {
    private Long id;
    private DonationQueueCommand donationQueueCommand;
    private Long userId;
    private LocalDateTime timeOfClearance;
}
