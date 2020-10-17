package ng.com.bitsystems.mis.command.patients;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class CompanyFolderCommand {
    private Long id;
    private String companyName;
    private String address;
    private String phone;
    private String email;
    private Set<PatientCommand> patientCommands = new HashSet<>();
}
