package ng.com.bitsystems.mis.command.admissions.outpatient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.users.UserCommand;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class OutpatientAdmissionDischargedCommand {
    private Long id;
    private UserCommand userCommand;
    private LocalDate dateDischarged;
    private String comment;
    private OutpatientAdmissionCommand outpatientAdmissionCommand;
}
