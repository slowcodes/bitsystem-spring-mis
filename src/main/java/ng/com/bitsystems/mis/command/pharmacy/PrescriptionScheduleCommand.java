package ng.com.bitsystems.mis.command.pharmacy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PrescriptionScheduleCommand {
    private Long id;
    private Long user_id;
    private String prescriptionNote;
    private int noOfDosage;
    private Integer hourlyInterval;
    private Integer timeOfSchedule;
    private Long prescriptionId;
}
