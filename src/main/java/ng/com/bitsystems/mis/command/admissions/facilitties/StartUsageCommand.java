package ng.com.bitsystems.mis.command.admissions.facilitties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class StartUsageCommand {
    private Long id;
    private FacilitiesCommand facilitiesCommand;
    private Long inpatientAdmissionCommandId;
    private LocalDateTime startTime;
}
