package ng.com.bitsystems.mis.command.patients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class PatientMedicalHistoryCommand {
    private Long id;
    private Long patientId;
    private PatientMedicalActivityListingCommand patientMedicalActivityListingCommand;
    private Long userId;
    private LocalDate dateRecorded;
}
