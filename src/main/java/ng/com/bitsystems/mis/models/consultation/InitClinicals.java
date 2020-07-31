package ng.com.bitsystems.mis.models.consultation;

import lombok.*;

import javax.persistence.MappedSuperclass;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@MappedSuperclass
public class InitClinicals {
    private String presentingComplaints;
    private String historyPresentingComplaints;
    private String clinicalExamination;
    private Integer provisionalDiagnosis;
}
