package ng.com.bitsystems.mis.command.admissions.facilitties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.admissions.inpatient.InpatientAdmissionCommand;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class StartUsageCommand {
    private Long id;
    private FacilitiesCommand facilitiesCommand;
    private InpatientAdmissionCommand inpatientAdmissionCommand;
    private LocalDateTime startTime;
}
