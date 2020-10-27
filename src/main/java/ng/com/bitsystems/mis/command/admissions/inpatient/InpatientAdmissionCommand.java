package ng.com.bitsystems.mis.command.admissions.inpatient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.admissions.facilitties.StartUsageCommand;

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
    private Long patientCommandId;
    private Long userId;
    private String status;
    private LocalDate admissionDate;
    private String clinicalExamination;
    private String historyOfPresentingComplaint;
    private String presentingComplaint;
    private String provisionalDiagnosis;
}
