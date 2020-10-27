package ng.com.bitsystems.mis.command.admissions.inpatient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class InpatientDischargeCommand {
    private Long id;
    private Long userId;
    private LocalDate dateDischarged;
    private String comment;
    private InpatientAdmissionCommand inpatientAdmissionCommand;
}
