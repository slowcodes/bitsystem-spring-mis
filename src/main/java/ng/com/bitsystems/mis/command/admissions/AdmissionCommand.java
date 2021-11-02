package ng.com.bitsystems.mis.command.admissions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ng.com.bitsystems.mis.command.admissions.facilitties.StartUsageCommand;
import ng.com.bitsystems.mis.command.pharmacy.PrescriptionCommand;
import ng.com.bitsystems.mis.models.admissions.AdmissionMode;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class AdmissionCommand {
    private Long id;
    private Long patientId;
    private Long userId;
    private String status;
    private LocalDate admissionDate;
    private AdmissionMode admissionMode;
    private String clinicalExamination;
    private String historyOfPresentingComplaint;
    private String presentingComplaint;
    private String provisionalDiagnosis;
    private Set<StartUsageCommand> startUsageCommand = new HashSet<>();
    private Set<PrescriptionCommand> prescriptionCommand = new HashSet<>();
}
