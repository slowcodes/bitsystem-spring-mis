package ng.com.bitsystems.mis.command.patients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class PatientMedicalActivityListingCommand {
    private Long id;
    private String medicalActivity;
}
