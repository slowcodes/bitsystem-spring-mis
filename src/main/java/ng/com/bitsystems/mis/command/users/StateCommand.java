package ng.com.bitsystems.mis.command.users;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.patients.PatientCommand;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class StateCommand {
    private Long id;
    private String state;
    private int code;
    private Set<PatientCommand> patientCommands = new HashSet<>();
}
