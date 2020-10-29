package ng.com.bitsystems.mis.command.admissions.outpatient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class OutpatientAdmissionDischargedCommand {
    private Long id;
    private Long userId;
    private LocalDate dateDischarged;
    private String comment;
    private OutpatientAdmissionCommand outpatientAdmissionCommand;
}
