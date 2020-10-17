package ng.com.bitsystems.mis.command.admissions.outpatient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class OutpatientPrecriptionScheduleCommand {
    private Long id;
    private Long users_d;
    private LocalDateTime administrationTime;
    private String comment;
    private OutpatientPrescriptionCommand OutpatientPrescriptionCommand;
}
