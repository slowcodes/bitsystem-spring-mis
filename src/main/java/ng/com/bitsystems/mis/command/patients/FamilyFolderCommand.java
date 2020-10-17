package ng.com.bitsystems.mis.command.patients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class FamilyFolderCommand {
    private Long id;
    private String familyName;
    private String phone;
    private String email;
    private Date dateRegistered;
    private Set<PatientCommand> patientCommands = new HashSet<>();
    private Set<FamilyHistoryCommand> patientsFamilyHistory = new HashSet<>();
}
