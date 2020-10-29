package ng.com.bitsystems.mis.command.admissions.outpatient;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class OutpatientAdmissionCommand {
    private Long id;
    private Set<OutpatientPrescriptionCommand> outpatientPrescriptionCommand = new HashSet<>();
    private Long patientId;
    private Long userId;
    private String status;
    private LocalDate admissionDate;
    private String presentingComplaints;
    private String historyPresentingComplaints;
    private String clinicalExamination;
    private String provisionalDiagnosis;
}
