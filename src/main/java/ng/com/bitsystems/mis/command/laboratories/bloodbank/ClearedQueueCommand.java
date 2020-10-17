package ng.com.bitsystems.mis.command.laboratories.bloodbank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.DonationQueue;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class ClearedQueueCommand {
    private Long id;
    private DonationQueue donationQueue;
    private Long userId;
    private LocalDateTime timeOfClearance;
}
