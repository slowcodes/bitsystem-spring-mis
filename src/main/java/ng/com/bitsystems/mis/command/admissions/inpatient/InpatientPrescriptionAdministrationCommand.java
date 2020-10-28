package ng.com.bitsystems.mis.command.admissions.inpatient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class InpatientPrescriptionAdministrationCommand {
    private Long id;
    private Long userId;
    private LocalDateTime administrationTime;
    private String comment;
    private InpatientPrescriptionCommand inpatientPrescriptionCommand;
}
