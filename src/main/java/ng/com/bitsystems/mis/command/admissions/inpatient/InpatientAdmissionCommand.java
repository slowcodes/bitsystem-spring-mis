package ng.com.bitsystems.mis.command.admissions.inpatient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.admissions.facilitties.StartUsageCommand;
import ng.com.bitsystems.mis.command.patients.PatientCommand;
import ng.com.bitsystems.mis.command.users.UserCommand;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class InpatientAdmissionCommand {
    private Long id;
    private Set<StartUsageCommand> startUsageCommand = new HashSet<>();
    private Set<InpatientPrescriptionCommand> inpatientPrescriptionCommand = new HashSet<>();
    private PatientCommand patientCommand;
    private UserCommand userCommand;
    private String status;
    private LocalDate admissionDate;

}
