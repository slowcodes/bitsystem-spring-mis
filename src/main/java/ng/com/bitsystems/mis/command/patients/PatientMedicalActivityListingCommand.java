package ng.com.bitsystems.mis.command.patients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class PatientMedicalActivityListingCommand {
    private Long id;
    private String medicalActivity;
    private Set<PatientMedicalHistoryCommand> patientMedicalHistoryCommands = new HashSet<>();
}
