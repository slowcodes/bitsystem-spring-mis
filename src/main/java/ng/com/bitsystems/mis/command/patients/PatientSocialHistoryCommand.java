package ng.com.bitsystems.mis.command.patients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class PatientSocialHistoryCommand {
    private Long id;
    private SocioCulturalCommand socioCulturalCommand;
    private Long patientId;
    private Long userId;
    private LocalDate dateRecorded;
}
