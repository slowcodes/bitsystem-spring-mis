package ng.com.bitsystems.mis.command.laboratories.bloodbank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.models.laboratories.bloodbank.Compensation;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
public class DonationQueueCommand {
    private Long id;
    private Long donorRegistryId;
    private Long userId;
    private Date timeOfSchedule;
    private String status;
    private Compensation compensation;
}
