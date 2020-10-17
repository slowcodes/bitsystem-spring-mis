package ng.com.bitsystems.mis.command.consultation;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
public class ClerksCommand {
    private Long id;
    private String presentingComplaints;
    private String historyPresentingComplaints;
    private String clinicalExamination;
    private Integer provisionalDiagnosis;
    private Long patientId;
    private Long usersId;
    private LocalDate consultationDate;
}
