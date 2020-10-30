package ng.com.bitsystems.mis.command.laboratories.bloodbank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class DonationCommand {
    private Long id;
    private ClearedQueueCommand clearedQueueCommand;
    private Long storageId;
    private Long userId;
    private LocalDateTime timeOfDonation;
    private String tagId;
}
