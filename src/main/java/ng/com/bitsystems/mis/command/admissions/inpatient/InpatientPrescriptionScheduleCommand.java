package ng.com.bitsystems.mis.command.admissions.inpatient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class InpatientPrescriptionScheduleCommand {
    private Long id;
    private InpatientPrescriptionCommand inpatientPrescriptionCommand;
    private Long users_id;
    private String prescriptionNote;
    private int noOfDosage;
    private Integer hourlyInterval;
    private Integer timeOfSchedule;
}
